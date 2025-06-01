package Generic_Object_Printer;
import java.lang.reflect.*; // Reflection API ইম্পোর্ট করি
import java.util.*; // Collection Framework ইউটিল ক্লাস ইম্পোর্ট

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;


public class Generic_Object_Printer {

    private final Set<Object> visited = Collections.newSetFromMap(new IdentityHashMap<>());// একই অবজেক্ট বারবার প্রিন্ট না করার জন্য ট্র্যাক রাখি

    public String printObject(Object obj) {

        return printObject(obj, 0); // ইন্ডেন্টেশন লেভেল ০ থেকে শুরু
    }

    private String printObject(Object obj, int indent){
        if (obj == null) return "null";

        Class<?> cls = obj.getClass();

        // যদি প্রিমিটিভ, স্ট্রিং, নাম্বার, বুলিয়ান বা ক্যারেক্টার হয় — সরাসরি ভ্যালু রিটার্ন
        if (cls.isPrimitive() || obj instanceof String || obj instanceof Number || obj instanceof Boolean ||
        obj instanceof  Character)
        {
return obj.toString();
        }

        // যদি অ্যারে হয়
        if (cls.isArray()){
            StringBuilder sb = new StringBuilder();
            int length  = Array.getLength(obj);
            sb.append(cls.getComponentType().getSimpleName())
                    .append("[").append(length).append("]");
            for (int i = 0 ; i < length; i++){
                sb.append("\n");
                indent(sb, indent + 1);
                Object element = Array.get(obj, i);
                sb.append(printObject(element, indent +1)).append(",");
            }
            sb.append("\n");
            indent(sb, indent );
            sb.append("}");
            return sb.toString();
        }

        if (visited.contains(obj)){
            return "(cyclic reference to"+ cls.getName()+")";
        }
        visited.add(obj);

        StringBuilder sb = new StringBuilder();
        sb.append(cls.getSimpleName()).append(" {");

        // সব ডিক্লেয়ার্ড ফিল্ডে লুপ চালানো হয়
        for (Field field : cls.getDeclaredFields()){
            field.setAccessible(true);
            sb.append("\n");
            indent(sb, indent + 1);
            sb.append(field.getName()).append(" = ");
            try{
                Object value = field.get(obj);
                sb.append(printObject(value, indent +1));
            } catch (IllegalAccessException e){
                sb.append("access denied");
            }
        }
        sb.append("\n");
        indent(sb, indent);
        sb.append("}");
        return sb.toString();
    }
    // ইন্ডেন্টেশন হেল্পার ফাংশন
    private void indent(StringBuilder sb, int indent) {
        for (int i = 0; i < indent; i++) {
            sb.append("  "); // প্রতিটি ইন্ডেন্টে দুইটা স্পেস
        }
    }
    // টেস্ট করার জন্য main মেথড
    public static void main(String[] args) {
        Generic_Object_Printer printer = new Generic_Object_Printer();

        // টেস্ট ১: Simple ক্লাস
        class Person {
            String name = "Evan";
            int age = 22;
        }

        // টেস্ট ২: Nested ক্লাস
        class Student {
            Person info = new Person();
            int[] marks = {90, 85, 88};
        }

        Student s = new Student();
        System.out.println(printer.printObject(s)); // প্রিন্ট করা হয়
    }

}
