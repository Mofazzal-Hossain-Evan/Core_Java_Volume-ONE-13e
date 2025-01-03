import java.util.Locale;

public class FormatterTool {

    public static void main(String[] args) {
        System.out.println("Welcome to the Custom Formatter Tool!");

        double value = 1234.5433;
        int number = 159;

        // 1. Fixed-point floating-point formatting
        System.out.printf("Fixed-point format: %8.2f%n", value);

        // 2. Exponential format
        System.out.printf("Exponential format: %8.2E%n", value);

        // 3. Group separators and parentheses for negative values
        double negativeValue = -12345.65434;
        System.out.printf("Group separators and parentheses: %,(.2f%n", negativeValue);

        // 4. Decimal, hexadecimal, and octal representations
        System.out.printf("Decimal: %d, Hexadecimal: %x, Octal: %o%n", number, number, number);

        // 5. String formatting with placeholders
        String name = "Imran";
        int age = 30;
        System.out.printf("Hello, %s. Next year, you'll be %d.%n", name, age + 1);

        // 6. Left-justified formatting
        System.out.printf("Left-justified: |%-10.2f|%n", value);

        // 7. Argument indexing
        System.out.printf("First argument in decimal: %1$d, in hexadecimal: %1$x%n", number);

        // 8. Locale-specific formatting
        System.out.printf(Locale.US, "Locale-specific format: %,.2f%n", value);

        // 9. Using String.format to create a formatted string
        String formattedMessage = String.format("Formatted message: Value = %.2f, Name = %s", value, name);
        System.out.println(formattedMessage);

        // 10. Using formatted method (Java 15+)
        String newerFormattedMessage = "Formatted using the new method: Value = %.2f, Name = %s".formatted(value, name);
        System.out.println(newerFormattedMessage);

        // Conclusion
        System.out.println("Thank you for using the Custom Formatter Tool!");
    }
}
