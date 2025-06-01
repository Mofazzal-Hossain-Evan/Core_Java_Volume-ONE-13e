package Universal_Object_Inspector_3000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class UniversalObjectInspector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full class name to inspect (e.g., java.util.Date): ");
        String className = scanner.nextLine();

        try{

            Class<?> c1 = Class.forName(className);

            Object obj = null;
            try{
                obj = c1.getConstructor().newInstance();
            } catch (Exception e){
                System.out.println("⚠️ Could not instantiate object using default constructor.");
            }


            // Start inspection
            inspectClass(c1);

            // If object was created, show generic toString()
              if (obj != null){
                  System.out.println("\n🔍 Generic toString():");
                  genericToString(obj);
              }
        } catch (ClassNotFoundException e){
            System.out.println("❌ Class not found.");
        }
    }

    public static void inspectClass(Class<?> c1){
        System.out.println("\n📦 Class Name: " + c1.getName());

        //superClass
        Class<?> superCl = c1.getSuperclass();
        if (superCl != null) {
            System.out.println();
        }




    //superClass
    Class<?> SuperCl = c1.getSuperclass();
    if (superCl != null) {
        System.out.println("🧬 Superclass: " +superCl.getName() );
    }

    //interFace
        Class<?>[] interfaces = c1.getInterfaces();
        System.out.println("🔗 Interfaces:");
        for (Class<?> iface : interfaces){
            System.out.println(" - " + iface.getName());
        }

        //construction
        System.out.println("\n🏗️ Constructors:");
        Constructor<?>[] constructors = c1.getConstructors();
        for (Constructor<?> ctor : constructors) {
            System.out.println(" "+ ctor);
        }

        //fields
        System.out.println("\n📄 Fields:");
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(" " + field);
        }

        //Method
        System.out.println("\n🔧 Methods:");
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(" " + method);
        }

        // Check if it's an enum
        if (c1.isEnum()){
            System.out.println("\n📌 Enum constants:");
            Object[] constants = c1.getEnumConstants();
            for (Object constant : constants){
                System.out.println("  - " + constant + " (" + constant.getClass().getName() + ")");
            }
        }

        // Check for array
        if (c1.isArray()){
            System.out.println("\n📂 Array Type Info:");
            System.out.println("  Component Type: " + c1.getComponentType());
            System.out.println("Internal Name: " + c1.getName());
        }

        // Primitive check
        if (c1.isPrimitive()){
            System.out.println("\n⚙️ This is a primitive type.");
        }

        // Class object comparison
        System.out.println("\n📌 Class object check:");
        System.out.println("  cl == cl.getClass(): " + (c1 == c1.getClass()));
        System.out.println("  cl instanceof Class: " + (c1 instanceof Class));
    }

    public static void genericToString(Object obj){
        Class<?> c1 = obj.getClass();
        System.out.println((c1.getName() + "["));

        Field[]  fields = c1.getDeclaredFields();
        for (int i = 0; i< fields.length; i++){
            fields[i].setAccessible(true); // Allow access to private fields
         try {
            Object value = fields[i].get(obj);
             System.out.println(fields[i].getName()+"+" + value);
        } catch (IllegalAccessException  e){
             System.out.println(fields[i].getName()+  "=<inaccessible>");
         }
         if (i < fields.length -1) System.out.println(", ");


        }
        System.out.println("}");

    }
}
