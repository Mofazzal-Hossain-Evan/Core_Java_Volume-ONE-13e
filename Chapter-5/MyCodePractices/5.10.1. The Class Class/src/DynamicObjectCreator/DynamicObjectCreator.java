package DynamicObjectCreator;

import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Scanner;

public class DynamicObjectCreator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("🔍 Enter the fully qualified class name (e.g., java.util.Date):");
        String className = scanner.nextLine();

        try{
            // Load the class by name
Class<?> cls = Class.forName(className);

            // Get the public no-arg constructor
            Constructor<?> constructor = cls.getConstructor();

            // Create a new instance
            Object obj = constructor.newInstance();

            // Output details
            System.out.println("✅ Object created successfully!");
            System.out.println("📦 Class Name: " + obj.getClass().getName());
            System.out.println("📄 Object: " + obj.toString());

        } catch (ClassNotFoundException e) {
            System.err.println("❌ Class not found: " + className);
        } catch (NoSuchMethodException e) {
            System.err.println("❌ No public no-arg constructor found.");
        } catch (Exception e) {
            System.err.println("❌ Error during object creation:");
            e.printStackTrace();

            //printStackTrace() হলো একটি Throwable ক্লাসের মেথড,
            // যেটা error বা exception ঘটলে তার বিস্তারিত তথ্য standard error stream (মানে কনসোলে) প্রিন্ট করে।
        }
    }
}
