package String_Formatter;

/* Test program to demonstrate static methods, private helpers, and polymorphism */
public class FormatterTest {
    public static void main(String[] args) {
        // Using static methods directly
        System.out.println("Title Case (static): " + StringFormatter.toTitleCase("hello world! java programming"));
        System.out.println("Camel Case (static): " + StringFormatter.toCamelCase("hello world! java programming"));

        // Using implementing classes
        StringFormatter textProcessor = new TextProcessor();
        StringFormatter codeFormatter = new CodeFormatter();

        System.out.println("TextProcessor format: " + textProcessor.format("java interface utilities"));
        System.out.println("CodeFormatter format: " + codeFormatter.format("java interface utilities"));

        // Test private helper indirectly (unwanted chars removed)
        System.out.println("Title Case (cleaned): " + StringFormatter.toTitleCase("  *** hello @world *** "));
    }
}
