package Universal_toString_Generator;

import java.lang.reflect.Field;
import java.util.Objects;

public class UniversalToString {
    public static String UniversalToString(Object obj){
        if (obj == null){
            return "null";
        }

        // ক্লাস পাওয়া
        Class<?> clazz = obj.getClass();
        StringBuilder result = new StringBuilder(new StringBuilder(clazz.getSimpleName()) + "[");
        try{

            // সকল ফিল্ড পাওয়া
            Field[] fields = clazz.getDeclaredFields();
            for (int i = 0; i < fields.length; i++){
                Field field = fields[i];
                // প্রাইভেট ফিল্ড অ্যাক্সেসযোগ্য করা
                field.setAccessible(true);

                // ফিল্ডের নাম এবং মান পাওয়া
                String fieldName = field.getName();
                Object fieldValue = field.get(obj);

                // ফিল্ডের মান ফরম্যাট করা
                String formattedValue;
                if (fieldValue == null){
                    formattedValue = "null";
                } else if (fieldValue.getClass().isPrimitive() ||
                fieldValue instanceof  String ||
                        fieldValue instanceof  Number ||
                        fieldValue instanceof  Boolean ||
                        fieldValue instanceof Character) {
    formattedValue = fieldValue.toString();
                } else {
                    // নেস্টেড অবজেক্টের জন্য রিকার্সিভ কল
    formattedValue = UniversalToString(fieldValue);
                }
                result.append(fieldName).append("=").append(formattedValue);
                if(i < fields.length -1) {
                    result.append(", ");
                }

            }

        } catch (IllegalAccessException e) {
            result.append("ত্রুটি: ফিল্ড অ্যাক্সেস করা যায়নি");
            e.printStackTrace();
        }
        result.append("]");
        return  result.toString();

    }

    public static void main(String[] args) {
        class Address {
        private String city = "Dhaka";
    }
    class Person{
        private String name = "Alice";
        private int age = 30;
        private Address address = new Address();
    }
    Person person = new Person();
        System.out.println(UniversalToString(person));
}}
