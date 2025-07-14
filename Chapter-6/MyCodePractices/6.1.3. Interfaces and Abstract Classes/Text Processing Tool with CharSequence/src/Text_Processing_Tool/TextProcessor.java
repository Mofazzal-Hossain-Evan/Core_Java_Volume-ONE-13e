/* Package declaration to match directory structure */
package Text_Processing_Tool;

/* Theory: According to *Core Java* by Cay S. Horstmann (Volume I, 13th Edition, Chapter 6), interfaces like CharSequence define a contract that multiple classes can implement, enabling polymorphism. This allows TextProcessor to work with any CharSequence implementation (e.g., String, StringBuilder, MyTextBuffer) without needing to know their internal details. This flexibility is a key advantage of interfaces over abstract classes, as interfaces support multiple inheritance, allowing classes to implement multiple behaviors (Horstmann, p. 250). */

/* Class containing static methods to process text using CharSequence */
public class TextProcessor {
    /* Counts the total characters in a CharSequence */
    public static int countCharacters(CharSequence sequence) {
        if (sequence == null) return 0; // Return 0 for null sequence
        return sequence.length(); // Return length of the sequence
    }

    /* Extracts a subsequence from start (inclusive) to end (exclusive) */
    public static CharSequence extractSubsequence(CharSequence sequence, int start, int end) {
        if (sequence == null) return ""; // Return empty string for null sequence
        if (start < 0 || end > sequence.length() || start > end) {
            throw new IllegalArgumentException("Invalid start or end index"); // Validate indices
        }
        return sequence.subSequence(start, end); // Extract and return subsequence
    }

    /* Theory: *Effective Java* by Joshua Bloch (Item 64) emphasizes using interfaces like CharSequence for method parameters to maximize flexibility. By accepting CharSequence, these methods can process any class implementing the interface, including future implementations, without modification (Bloch, p. 302). The isEmpty method leverages Java 17's addition to CharSequence, showing how interfaces can evolve with new default methods. */

    /* Checks if a CharSequence is empty using Java 17 isEmpty method */
    public static boolean isEmpty(CharSequence sequence) {
        if (sequence == null) return true; // Null sequence is considered empty
        return sequence.isEmpty(); // Use Java 17 isEmpty method
    }

    /* Converts a CharSequence to uppercase */
    public static String toUpperCase(CharSequence sequence) {
        if (sequence == null) return ""; // Return empty string for null sequence
        return sequence.toString().toUpperCase(); // Convert to string and uppercase
    }
}