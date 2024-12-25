package CastingDemoWithInput;

import java.util.Scanner;

public class CastingDemoWithInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double x = input.nextDouble();

        int nx = (int) Math.round(x);

        int truncatedValue = (int)x;

        System.out.print("Enter an integer value: ");
        int intValue = input.nextInt();

        double doubleValue = (double) intValue;

        float floatValue = (float)x;
        System.out.print("Enter a large integer value to cast to byte: ");

        // Prompt for a large integer value
        System.out.print("Enter a large integer value to cast to byte: ");
        int largeInt = input.nextInt();

        // Casting from int to byte (overflow example)
        byte byteValue = (byte) largeInt;

        // Print results
        System.out.println("\nResults:");
        System.out.println("Original double value: " + x);
        System.out.println("Rounded and cast to int: " + nx);
        System.out.println("Truncated (explicit cast) to int: " + truncatedValue);
        System.out.println("Int value cast to double: " + doubleValue);
        System.out.println("Double value cast to float: " + floatValue);
        System.out.println("Int value cast to byte (with overflow): " + byteValue);

        input.close(); // Close the scanner


    }
}
