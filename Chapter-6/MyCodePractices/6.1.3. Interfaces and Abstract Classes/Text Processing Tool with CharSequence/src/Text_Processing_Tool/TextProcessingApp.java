/* Package declaration to match directory structure */
package Text_Processing_Tool;

/* Theory: *Effective Java* (Item 64) emphasizes that using interfaces like CharSequence in method signatures (as in TextProcessor) allows for maximum flexibility, as any class implementing the interface can be passed. This enables TextProcessingApp to test String, StringBuilder, and MyTextBuffer polymorphically. In contrast, TextContainer's methods are tied to its subclasses, restricting polymorphism to SimpleTextContainer and preventing use with standard classes like String (Bloch, p. 302). */

/* Main class to demonstrate text processing with CharSequence and TextContainer */
public class TextProcessingApp {
    /* Main method to run the text processing simulation */
    public static void main(String[] args) {
        /* Create instances of different CharSequence implementations */
        CharSequence string = "Hello, World!"; // String instance
        CharSequence stringBuilder = new StringBuilder("Java Programming"); // StringBuilder instance
        MyTextBuffer myTextBuffer = new MyTextBuffer("Custom Text"); // MyTextBuffer instance

        /* Test CharSequence processing methods */
        System.out.println("Testing CharSequence processing:");
        System.out.println("String: " + string);
        System.out.println("  Character count: " + TextProcessor.countCharacters(string));
        System.out.println("  Subsequence (0,5): " + TextProcessor.extractSubsequence(string, 0, 5));
        System.out.println("  Is empty: " + TextProcessor.isEmpty(string));
        System.out.println("  Uppercase: " + TextProcessor.toUpperCase(string));
        System.out.println();

        System.out.println("StringBuilder: " + stringBuilder);
        System.out.println("  Character count: " + TextProcessor.countCharacters(stringBuilder));
        System.out.println("  Subsequence (0,4): " + TextProcessor.extractSubsequence(stringBuilder, 0, 4));
        System.out.println("  Is empty: " + TextProcessor.isEmpty(stringBuilder));
        System.out.println("  Uppercase: " + TextProcessor.toUpperCase(stringBuilder));
        System.out.println();

        System.out.println("MyTextBuffer: " + myTextBuffer);
        System.out.println("  Character count: " + TextProcessor.countCharacters(myTextBuffer));
        System.out.println("  Subsequence (0,6): " + TextProcessor.extractSubsequence(myTextBuffer, 0, 6));
        System.out.println("  Is empty: " + TextProcessor.isEmpty(myTextBuffer));
        System.out.println("  Uppercase: " + TextProcessor.toUpperCase(myTextBuffer));
        System.out.println();

        /* Append to MyTextBuffer and test again */
        myTextBuffer.append(" Buffer"); // Append text to MyTextBuffer
        System.out.println("After appending to MyTextBuffer: " + myTextBuffer);
        System.out.println("  Character count: " + TextProcessor.countCharacters(myTextBuffer));
        System.out.println();

        /* Test TextContainer for comparison */
        System.out.println("Testing TextContainer with SimpleTextContainer:");
        SimpleTextContainer container = new SimpleTextContainer("Abstract Text"); // SimpleTextContainer instance
        System.out.println("SimpleTextContainer: " + container.getText());
        System.out.println("  Character count: " + container.countCharacters());
        System.out.println("  Subsequence (0,8): " + container.extractSubsequence(0, 8));
        System.out.println("  Is empty: " + container.isEmpty());
        System.out.println("  Uppercase: " + container.toUpperCase());
        System.out.println();

        /* Append to SimpleTextContainer and test again */
        container.append(" Container"); // Append text to SimpleTextContainer
        System.out.println("After appending to SimpleTextContainer: " + container.getText());
        System.out.println("  Character count: " + container.countCharacters());
    }
}