package Interface_and_Enum_Detector;

import java.lang.reflect.Modifier;
import java.lang.reflect.RecordComponent;

public class TypeInspector  {


    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Usage: java TypeInspector <fully-qualified-class-name>");
            return;
        }

        String className = args[0];
        try{
            Class<?> cls = Class.forName(className);

            String modifiers = Modifier.toString(cls.getModifiers());

            String type;
            if (cls.isInterface()){
                type = "Interface";
            } else if (cls.isEnum()){
                type = "Enum";
            } else if (cls.isRecord()) {
                type = "Record";
            } else {
                type = "Class"; // সাধারণ ক্লাস
        }
            System.out.println("===== " + className + " =====");
            System.out.println("Type      : " + type);
            System.out.println("Modifiers : " + modifiers);

            // ইন্টারফেস গুলো দেখাই যেগুলো ইমপ্লিমেন্ট করেছে
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces.length > 0){
                System.out.println("Implements: ");
            for (Class<?> infs : interfaces)
            {
                System.out.print(infs.getName()+ " ");
            }
                System.out.println();
            }
            // যদি রেকর্ড হয়, তাহলে কম্পোনেন্ট দেখাই
            if (cls.isRecord()){
                System.out.println("Record Concept:");
                RecordComponent[] components = cls.getRecordComponents();
                for (RecordComponent rc : components){
                    System.out.println(" - " + rc.getType().getSimpleName() + " " + rc.getName());
                }
            }
        } catch (ClassNotFoundException e){
            System.out.println("❌ Class not found: " + className);
        }
    }
}
