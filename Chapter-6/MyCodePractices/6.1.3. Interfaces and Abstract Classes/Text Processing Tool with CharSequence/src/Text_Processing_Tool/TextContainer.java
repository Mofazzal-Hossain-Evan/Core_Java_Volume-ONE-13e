/* Package declaration to match directory structure */
package Text_Processing_Tool;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 5) notes that
 abstract classes like TextContainer are useful for sharing common code among subclasses but
 restrict subclasses to a single inheritance hierarchy. Unlike CharSequence,
 which allows multiple implementations to coexist (e.g., String, StringBuilder), TextContainer requires subclasses to extend it,
 limiting their ability to inherit from other classes.
 This makes abstract classes less flexible for polymorphic behavior in scenarios where classes need to integrate with diverse APIs (Horstmann, p. 208).
  */

/* Abstract class for text containers with similar processing methods */
public abstract class TextContainer {
    /* Abstract method to get the text content */
    public abstract String getText();

    /* Counts the total characters in the text */
    public int countCharacters() {
        String text = getText(); // Get text from subclass
        return (text == null) ? 0 : text.length(); // Return length or 0 for null
    }

    /* Extracts a substring from start (inclusive) to end (exclusive) */
    public String extractSubsequence(int start, int end) {
        String text = getText(); // Get text from subclass
        if (text == null) return ""; // Return empty string for null
        if (start < 0 || end > text.length() || start > end) {
            throw new IllegalArgumentException("Invalid start or end index"); // Validate indices
        }
        return text.substring(start, end); // Extract and return substring
    }

    /* Theory: *Effective Java* (Item 20) highlights that abstract classes like TextContainer provide a way to
    share implementation code but at the cost of flexibility. Unlike CharSequence, which allows existing classes
    like String to be used without modification, TextContainer requires custom subclasses,
     which cannot leverage existing classes like String or StringBuilder. This limits its interoperability
     with standard Java APIs (Bloch, p. 102). */

    /* Checks if the text is empty */
    public boolean isEmpty() {
        String text = getText(); // Get text from subclass
        return text == null || text.isEmpty(); // Return true if null or empty
    }

    /* Converts the text to uppercase */
    public String toUpperCase() {
        String text = getText(); // Get text from subclass
        return (text == null) ? "" : text.toUpperCase(); // Convert to uppercase or return empty
    }
}