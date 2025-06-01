package Reflection_Based_Serializer;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static boolean isPrimitiveOrWrapperOrString(Class<?> clazz){
        return clazz.isPrimitive() ||
                clazz == String.class ||
                clazz == Integer.class ||
                clazz == Double.class ||
                clazz == Boolean.class ||
                clazz == Character.class ||
                clazz == Long.class ||
                clazz == Float.class ||
                clazz == Short.class ||
                clazz == Byte.class;
    }
    public static String[] splitByComma(String content, char openBrace, char closeBrace){

     if (content.isEmpty()) return new String[12];
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        int braceCount = 0;
        boolean inQuotes = false;

        for (int i = 0; i < content.length(); i++){
            char c = content.charAt(i);
            if (c == '"'){
                inQuotes = !inQuotes;
            } else if (!inQuotes) {
                if (c == openBrace) braceCount++;
                else if (c == closeBrace) braceCount--;
            }
            if (c == ',' && braceCount == 0 && !inQuotes){
                result.add(current.toString().trim());
                current.setLength(0);
            } else {
                current.append(c);
            }
            }
        if (current.length()> 0){
            result.add(current.toString().trim());
        }
        return result.toArray(new String[0]);
        }
    }

