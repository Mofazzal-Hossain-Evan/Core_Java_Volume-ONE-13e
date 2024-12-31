import java.util.Scanner;

public class NumericTypeConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Numeric Type Conversion Simulator!");

         // Get an integer from the user
        System.out.print("Enter an integer value: ");
        int intValue = input.nextInt();

        float floatValue = intValue;
        System.out.println("Converted to float: " + floatValue);

        double doubleValue = intValue;
        System.out.println("Converted to double: " + doubleValue);

        long longValue = intValue;
        System.out.println("Converted to long: " + longValue);

        // Demonstrate potential precision loss
        System.out.print("\nEnter a large integer (e.g., 123456789): ");
        int largeInt = input.nextInt();
        float largeFloat = largeInt;
        System.out.println("Large integer converted to float (may lose precision): " + largeFloat);

        // Arithmetic operations between mixed types
        System.out.print("\nEnter a float value: ");
        float userFloat = input.nextFloat();
        System.out.println("Performing operations with mixed types...");

        double mixedResult = intValue + userFloat;
        System.out.println("Result of int + float (converted to double): " + mixedResult);

        long longOperand = 10000L;
        double result = longOperand + userFloat;
        System.out.println("Result of long + float (converted to double): " + result);

        System.out.println("\nThank you for using the Numeric Type Conversion Simulator!");

        input.close();
    }
}
