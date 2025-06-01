package Reflection_Based_Serializer;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

import static Reflection_Based_Serializer.Utils.isPrimitiveOrWrapperOrString;
import static Reflection_Based_Serializer.Utils.splitByComma;

public class ReflectionSerializers {

    public static String serialize(Object obj) throws IllegalAccessException {
        if (obj == null) return "null";
        StringBuilder sb = new StringBuilder();
        serializeObject(obj, sb, new IdentityHashMap<>());
        return sb.toString();
    }

    private static void serializeObject(Object obj, StringBuilder sb, Map<Object, Integer> visited)
            throws IllegalAccessException {
        if (obj == null) {
            sb.append("null");
            return;
        }

        if (visited.containsKey(obj)) {
            sb.append("\"[cyclic reference]\"");
            return;
        }
        visited.put(obj, visited.size());

        Class<?> clazz = obj.getClass();

        if (isPrimitiveOrWrapperOrString(clazz)) {
            if (clazz == String.class || clazz == Character.class || clazz == char.class) {
                sb.append("\"").append(obj.toString().replace("\"", "\\\"")).append("\"");
            } else {
                sb.append(obj);
            }
            return;
        }

        if (clazz.isArray()) {
            sb.append("[");
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                serializeObject(Array.get(obj, i), sb, visited);
                if (i < length - 1) sb.append(",");
            }
            sb.append("]");
            return;
        }

        sb.append(clazz.getName()).append("{");
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            sb.append(field.getName()).append("=");
            serializeObject(field.get(obj), sb, visited);
            if (i < fields.length - 1) sb.append(",");
        }
        sb.append("}");

        visited.remove(obj);
    }

    public static Object deserialize(String input) throws Exception {
        if (input == null || input.equals("null")) return null;
        return deserializeObject(input.trim(), new HashMap<>());
    }

    private static Object deserializeObject(String input, Map<Integer, Object> visited)
            throws Exception {
        if (input.equals("null")) return null;

        if (input.startsWith("\"") && input.endsWith("\"")) {
            return input.substring(1, input.length() - 1).replace("\\\"", "\"");
        }

        try {
            if (input.matches("-?\\d+")) return Integer.parseInt(input);
            if (input.matches("-?\\d+\\.\\d+")) return Double.parseDouble(input);
            if (input.equals("true") || input.equals("false")) return Boolean.parseBoolean(input);
        } catch (NumberFormatException ignored) {}

        if (input.startsWith("[") && input.endsWith("]")) {
            String content = input.substring(1, input.length() - 1).trim();
            if (content.isEmpty()) return new Object[0];
            String[] elements = splitByComma(content, '[', ']');
            Object[] array = new Object[elements.length];
            for (int i = 0; i < elements.length; i++) {
                array[i] = deserializeObject(elements[i].trim(), visited);
            }
            return array;
        }

        int braceIndex = input.indexOf('{');
        if (braceIndex == -1 || !input.endsWith("}")) throw new IllegalArgumentException("Invalid format: " + input);

        String className = input.substring(0, braceIndex);
        String content = input.substring(braceIndex + 1, input.length() - 1).trim();

        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object instance = constructor.newInstance();
        visited.put(visited.size(), instance);

        if (!content.isEmpty()) {
            String[] fields = splitByComma(content, '{', '}');
            for (String fieldStr : fields) {
                String[] parts = fieldStr.split("=", 2);
                if (parts.length != 2)
                    throw new IllegalArgumentException("Invalid field: " + fieldStr);

                String fieldName = parts[0].trim();
                String valueStr = parts[1].trim();

                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                Object value = deserializeObject(valueStr, visited);
                field.set(instance, value);
            }
        }

        return instance;
    }

}
