package Enum_Analyzer;

import java.lang.reflect.Method;
import java.util.Arrays;

public class EnumAnalyzer {
    public static void analyzeEnum(String className){
        try{

            Class<?> clazz = Class.forName(className);

            // Check if it's an enum
            if (!clazz.isEnum()){
                System.out.println(className + "is not an enum");
                return;
            }

            System.out.println("Enum: "+ className);

            Object[] enumConstants = clazz.getEnumConstants();
            System.out.println("Constants: " + Arrays.toString(
                    Arrays.stream(enumConstants)
                            .map(Object::toString)
                            .toArray()
            ));

            //Analyze each enum constant
            for(Object constant : enumConstants){
                analyzeEnumConstant(constant, clazz);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found : " + className);
        }
    }

    private static void analyzeEnumConstant(Object constant, Class<?> enumClass){
        try{

            // Get the actual class of the enum constant
            Class<?> constantClass = constant.getClass();
// Check if the constant's class differs from the enum class
            boolean isDifferenceClass = constantClass != enumClass;

            // Get the constant's name
            String constantName = constant.toString();

            // Check for overridden toString method
            Method toStringMethod = constantClass.getMethod("toString");
            boolean overridesToString = toStringMethod.getDeclaringClass() != Object.class;

            // Print constant details
            System.out.println("\nAnalyzing constant: " + constantName);
            if (overridesToString) {
                // Dynamically invoke toString
                String toStringResult = (String) toStringMethod.invoke(constant);
                System.out.println("  Overrides toString: true, returns \"" + toStringResult + "\"");
            } else {
                System.out.println("  Overrides toString: false");
            }

            // Print class information
            System.out.println(" CLass: " + constantClass.getSimpleName() +
                    (isDifferenceClass ? ", not" + enumClass.getSimpleName() : ""));

            // Check for other overridden methods
            analyzeOverriddenMethods(constant, enumClass);

        }catch ( Exception e){
            System.out.println("Error analyzing constant " + constant + ": " + e.getMessage());
        }
    }

    private static void analyzeOverriddenMethods(Object constant, Class<?> enumClass){
        try{
            // Get all declared methods of the constant's class
            Method[] methods = constant.getClass().getDeclaredMethods();

            for (Method method :  methods){
                // Skip synthetic methods, toString, and methods declared in the enum class
                if (method.isSynthetic() ||
                method.getName().equals("toString") ||
                method.getDeclaringClass() == enumClass){
                    continue;
                }
                // Check if method is declared in the constant's specific class
                System.out.println("  Found overridden method: " + method.getName());

                // Attempt to invoke the method if it has no parameters
                if (method.getParameterCount() == 0) {
                    try{
                        method.setAccessible(true);
                        Object result = method.invoke(constant);
                        System.out.println("  Invoke " + method.getName() + ": " + result);
                    } catch (Exception e){
                        System.out.println("  Failed to Invoke " + method.getName() + ": " + e.getMessage());
                    }
                } else {
                    System.out.println(" Cannot invoke " + method.getName() + ": has parameters" );
                }
            }
        } catch (Exception e){
            System.out.println("Error analyzing overridden methods for " + constant + ": " + e.getMessage());
        }
    }

    // Sample enum for testing
    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE {
            @Override
            public String toString() {
                return "XL";
            }

            // Custom method for EXTRA_LARGE
            public String getDescription() {
                return "Extra Large Size";
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        analyzeEnum(Size.class.getName());
    }

}
