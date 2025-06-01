package Dynamic_Class_Interceptor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicClassInspector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ক্লাসের নাম দিন (যেমন, java.util.Scanner): ");
        String ClassName = scanner.nextLine();

        try{
            // ক্লাস লোড করা
            Class<?> clazz = Class.forName(ClassName);

            // ক্লাসের নাম প্রিন্ট
            System.out.println("ক্লাসের নাম: " + clazz.getName());

            // প্যাকেজের নাম প্রিন্ট
            Package pkg = clazz.getPackage();
            System.out.println("প্যাকেজ: " + pkg != null ? pkg.getName() : "কোনো প্যাকেজ নেই");

            // ফিল্ড প্রিন্ট
            System.out.println("িল্ড প্রিন্ট");
            Field[] fields = clazz.getDeclaredFields();
            if (fields.length == 0){
                System.out.println("  কোনো ফিল্ড নেই");
            } else {
                for (Field field : fields){
                    System.out.println(" " + field);
                }
            }

            // মেথড প্রিন্ট
            System.out.println("েথড প্রিন্ট");
            Method[] methods = clazz.getDeclaredMethods();
            if (methods.length == 0) {
                System.out.println("  কোনো মেথড নেই");
            } else {
                for (Method method : methods) {
                    System.out.println("  " + method);
                }
                }

            // কনস্ট্রাক্টর প্রিন্ট
            System.out.println("কনস্ট্রাক্টরস:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            if (constructors.length == 0) {
                System.out.println("  কোনো কনস্ট্রাক্টর নেই");
            } else {
                for (Constructor<?> constructor : constructors) {
                    System.out.println(" " + constructor);
                }
            }

        }catch (ClassNotFoundException e){
            System.err.println("ত্রুটি: ক্লাস '" + ClassName + "' পাওয়া যায়নি।");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("একটি অপ্রত্যাশিত ত্রুটি ঘটেছে।");
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }
}
