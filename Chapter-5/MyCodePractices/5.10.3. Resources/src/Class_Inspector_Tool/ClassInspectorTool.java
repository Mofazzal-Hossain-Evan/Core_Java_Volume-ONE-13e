package Class_Inspector_Tool;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ClassInspectorTool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inspect which class? (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();

        System.out.println("Filter? (none / public / static): ");
        String filter = scanner.nextLine().trim().toLowerCase();

        try{
            Class<?> cls = Class.forName(className);


            System.out.println("\n===== CLASS: " + className + " =====");

            // সুপারক্লাস ও ইন্টারফেস দেখাই
            Class<?> superclass = cls.getSuperclass();
            if (superclass != null){
                System.out.println("SuperClass" + superclass.getName());
            }

            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces.length > 0){
                System.out.println("Implements: ");
                for (Class<?> iface : interfaces){
                    System.out.println(iface.getName() + " ");
                }
                System.out.println();
            }
            System.out.println("\n--- Constructors ---");
            printConstructors(cls, filter);

            System.out.println("\n--- Methods ---");
            printMethods(cls, filter);

            System.out.println("\n--- Fields ---");
            printFields(cls, filter);

        } catch (ClassNotFoundException e){
            System.out.println("Class not found: " + className);
        }
    }

    // কনস্ট্রাক্টর দেখানোর জন্য

    private static void printConstructors(Class<?> cls, String filter){
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (Constructor<?> c : constructors){
            if (passesFilter(c.getModifiers(), filter)){
                System.out.printf("%-10s %s(%s)\n",
                        Modifier.toString(c.getModifiers()),
                        cls.getSimpleName(),
                        getParameterTypes(c.getParameterTypes()));
            }
        }

    }

    // মেথড দেখানোর জন্য
    private static void printMethods(Class<?> cls, String filter) {
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            if (passesFilter(m.getModifiers(), filter)) {
                System.out.printf("%-10s %s %s(%s)\n",
                        Modifier.toString(m.getModifiers()),
                        m.getReturnType().getSimpleName(),
                        m.getName(),
                        getParameterTypes(m.getParameterTypes()));
            }
        }
    }

    // ফিল্ড দেখানোর জন্য
    private static void printFields(Class<?> cls, String filter) {

        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            if (passesFilter(f.getModifiers(), filter)) {
                System.out.printf("%-10s %s %s\n",
                        Modifier.toString(f.getModifiers()),
                        f.getType().getSimpleName(),
                        f.getName());
            }
        }
    }
    // প্যারামিটার টাইপ একসাথে comma দিয়ে সাজিয়ে আনি
    private static String getParameterTypes(Class<?>[] types) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < types.length; i++) {
            sb.append(types[i].getSimpleName());
            if (i < types.length - 1) sb.append(", ");
        }
        return sb.toString();
    }

    // ফিল্টার মোতাবেক ঠিক কিনা চেক করি
    private static boolean passesFilter(int modifiers, String filter) {
        return switch (filter) {
            case "public" -> Modifier.isPublic(modifiers);
            case "static" -> Modifier.isStatic(modifiers);
            default -> true;
        };
    }
    }