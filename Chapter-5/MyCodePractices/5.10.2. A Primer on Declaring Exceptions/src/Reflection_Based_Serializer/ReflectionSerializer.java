//package Reflection_Based_Serializer;
//
//import java.lang.reflect.Array;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.util.*;
//
//public class ReflectionSerializer {
//
//    // Serialize object to string
//    public static String serialize(Object obj) throws IllegalAccessException {
//        if (obj == null) return "null";
//        StringBuilder sb = new StringBuilder();
//        serializeObject(obj, sb, new IdentityHashMap<>());
//        return sb.toString();
//    }
//
//    private static void serializeObject(Object obj, StringBuilder sb, Map<Object, Integer> visited)
//            throws IllegalAccessException {
//        if (obj == null) {
//            sb.append("null");
//            return;
//        }
//
//        if (visited.containsKey(obj)) {
//            sb.append("\"[cyclic reference]\"");
//            return;
//        }
//        visited.put(obj, visited.size());
//
//        Class<?> clazz = obj.getClass();
//
//        if (isPrimitiveOrWrapperOrString(clazz)) {
//            if (clazz == String.class || clazz == Character.class || clazz == char.class) {
//                sb.append("\"").append(obj.toString().replace("\"", "\\\"")).append("\"");
//            } else {
//                sb.append(obj);
//            }
//            return;
//        }
//
//        if (clazz.isArray()) {
//            sb.append("[");
//            int length = Array.getLength(obj);
//            for (int i = 0; i < length; i++) {
//                serializeObject(Array.get(obj, i), sb, visited);
//                if (i < length - 1) sb.append(",");
//            }
//            sb.append("]");
//            return;
//        }
//
//        sb.append(clazz.getName()).append("{");
//        Field[] fields = clazz.getDeclaredFields();
//        for (int i = 0; i < fields.length; i++) {
//            Field field = fields[i];
//            field.setAccessible(true);
//            sb.append(field.getName()).append("=");
//            serializeObject(field.get(obj), sb, visited);
//            if (i < fields.length - 1) sb.append(",");
//        }
//        sb.append("}");
//
//        visited.remove(obj);
//    }
//
//    // Deserialize string to object
//    public static Object deserialize(String input) throws Exception {
//        if (input == null || input.equals("null")) return null;
//        return deserializeObject(input.trim(), new HashMap<>());
//    }
//
//    private static Object deserializeObject(String input, Map<Integer, Object> visited)
//            throws Exception {
//        if (input.equals("null")) return null;
//
//        if (input.startsWith("\"") && input.endsWith("\"")) {
//            return input.substring(1, input.length() - 1).replace("\\\"", "\"");
//        }
//
//        // Handle primitives
//        try {
//            if (input.matches("-?\\d+")) return Integer.parseInt(input);
//            if (input.matches("-?\\d+\\.\\d+")) return Double.parseDouble(input);
//            if (input.equals("true") || input.equals("false")) return Boolean.parseBoolean(input);
//        } catch (NumberFormatException ignored) {}
//
//        // Handle arrays
//        if (input.startsWith("[") && input.endsWith("]")) {
//            String content = input.substring(1, input.length() - 1).trim();
//            if (content.isEmpty()) return new Object[0];
//            String[] elements = splitByComma(content, '[', ']');
//            Object[] array = new Object[elements.length];
//            for (int i = 0; i < elements.length; i++) {
//                array[i] = deserializeObject(elements[i].trim(), visited);
//            }
//            return array;
//        }
//
//        // Handle objects
//        int braceIndex = input.indexOf('{');
//        if (braceIndex == -1 || !input.endsWith("}")) throw new IllegalArgumentException("Invalid format: " + input);
//
//        String className = input.substring(0, braceIndex);
//        String content = input.substring(braceIndex + 1, input.length() - 1).trim();
//
//        Class<?> clazz = Class.forName(className);
//        Constructor<?> constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Object instance = constructor.newInstance();
//
//        visited.put(visited.size(), instance);
//
//        if (!content.isEmpty()) {
//            String[] fields = splitByComma(content, '{', '}');
//            for (String fieldStr : fields) {
//                String[] parts = fieldStr.split("=", 2);
//                if (parts.length != 2)
//                    throw new IllegalArgumentException("Invalid field: " + fieldStr);
//
//                String fieldName = parts[0].trim();
//                String valueStr = parts[1].trim();
//
//                Field field = clazz.getDeclaredField(fieldName);
//                field.setAccessible(true);
//                Object value = deserializeObject(valueStr, visited);
//                field.set(instance, value);
//            }
//        }
//
//        return instance;
//    }
//
//    private static boolean isPrimitiveOrWrapperOrString(Class<?> clazz) {
//        return clazz.isPrimitive() ||
//                clazz == String.class ||
//                clazz == Integer.class ||
//                clazz == Double.class ||
//                clazz == Boolean.class ||
//                clazz == Character.class ||
//                clazz == Long.class ||
//                clazz == Float.class ||
//                clazz == Short.class ||
//                clazz == Byte.class;
//    }
//
//    private static String[] splitByComma(String content, char openBrace, char closeBrace) {
//        if (content.isEmpty()) return new String[0];
//
//        List<String> result = new ArrayList<>();
//        StringBuilder current = new StringBuilder();
//        int braceCount = 0;
//        boolean inQuotes = false;
//
//        for (int i = 0; i < content.length(); i++) {
//            char c = content.charAt(i);
//            if (c == '"') {
//                inQuotes = !inQuotes;
//            } else if (!inQuotes) {
//                if (c == openBrace) braceCount++;
//                else if (c == closeBrace) braceCount--;
//            }
//
//            if (c == ',' && braceCount == 0 && !inQuotes) {
//                result.add(current.toString().trim());
//                current.setLength(0);
//            } else {
//                current.append(c);
//            }
//        }
//
//        if (current.length() > 0) {
//            result.add(current.toString().trim());
//        }
//
//        return result.toArray(new String[0]);
//    }
//
//    // Example usage
//    public static void main(String[] args) {
//        try {
//            class Person {
//                private String name;
//                private int age;
//                private Person friend;
//                private String[] hobbies;
//
//                public Person() {}
//
//                public Person(String name, int age) {
//                    this.name = name;
//                    this.age = age;
//                }
//
//                @Override
//                public String toString() {
//                    return "Person{name=" + name + ", age=" + age + ", friend=" + friend +
//                            ", hobbies=" + Arrays.toString(hobbies) + "}";
//                }
//            }
//
//            Person alice = new Person("Alice", 30);
//            alice.hobbies = new String[]{"reading", "gaming"};
//            Person bob = new Person("Bob", 25);
//            alice.friend = bob;
//
//            String serialized = serialize(alice);
//            System.out.println("Serialized: " + serialized);
//
//            Object deserialized = deserialize(serialized);
//            System.out.println("Deserialized: " + deserialized);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
