package Plugin_Loader;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class PluginLoaderFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("📦 Enter fully qualified class name (e.g., plugins.Tool): ");
        String className = scanner.nextLine();

        try{
            Class<?> clazz = Class.forName(className);
            System.out.println("🏗️ Available Constructors:");
            Constructor<?>[] constructors = clazz.getConstructors();
            for (int i = 0; i < constructors.length; i++){
                System.out.println(" [" + i + "] " + constructors[i]);
            }

            System.out.println("👉 Choose constructor index: ");
            int index = scanner.nextInt();
            Constructor<?> selectedCtor = constructors[index];

            Class<?>[] paramTypes = selectedCtor.getParameterTypes();
            Object[] argsTOPass = new Object[paramTypes.length];
            scanner.nextLine(); // clear new Line

            for (int i = 0; i< paramTypes.length; i++ ){
                System.out.println("🔤 Enter value for parameter " + paramTypes[i].getSimpleName());
                String input = scanner.nextLine();

                argsTOPass[i] = parseInput(input, paramTypes[i]);
            }

            Object obj = selectedCtor.newInstance(argsTOPass);
            System.out.println("✅ Successfully created object: " + obj);
        } catch (Exception e) {
            System.out.println("❌ Error: " + e);
            e.printStackTrace();
        }
    }

    private static Object parseInput(String input, Class<?> type){

        if (type == int.class || type == Integer.class){
            return Integer.parseInt(input);
        } else if (type == double.class || type == Double.class){
            return Double.parseDouble(input);
        } else if (type == boolean.class || type == Boolean.class) {
            return Boolean.parseBoolean(input);
        } else {
            return input; // treat as string
        }
    }


}
