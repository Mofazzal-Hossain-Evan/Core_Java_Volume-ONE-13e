/* Package declaration to match directory structure */
package Text_Processing_Tool;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that implementing an interface like CharSequence allows a custom class
 like MyTextBuffer to be used anywhere a CharSequence is expected, promoting loose coupling and polymorphism.
 Unlike abstract classes, interfaces do not impose a single inheritance hierarchy,
 enabling MyTextBuffer to potentially implement other interfaces if needed (Horstmann, p. 252).
 This flexibility is crucial for integrating with existing Java APIs, such as String.contains(), which accept CharSequence. */

/* Custom class implementing CharSequence for text storage and manipulation */
public class MyTextBuffer implements CharSequence {
    /* Internal character array to store text */
    private char[] buffer; // Character array for text data

    /* Constructor to initialize with a string */
    public MyTextBuffer(String initialText) {
        this.buffer = (initialText != null) ? initialText.toCharArray() : new char[0]; // Initialize buffer
    }

    /* Implements length method from CharSequence */
    @Override
    public int length() {
        return buffer.length; // Return length of the buffer
    }

    /* Implements charAt method from CharSequence */
    @Override
    public char charAt(int index) {
        if (index < 0 || index >= buffer.length) {
            throw new IndexOutOfBoundsException("Index: " + index); // Validate index
        }
        return buffer[index]; // Return character at index
    }

    /* Theory: *Effective Java* (Item 20) advocates for interfaces over abstract classes because they allow for greater
    flexibility in class design. MyTextBuffer's implementation of CharSequence demonstrates this by providing a custom text storage
     mechanism that can be used interchangeably with String or StringBuilder in methods expecting CharSequence (Bloch, p. 101).
      The subSequence method returns a new MyTextBuffer, ensuring immutability of the subsequence, aligning with CharSequence's expected behavior. */

    /* Implements subSequence method from CharSequence */
    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > buffer.length || start > end) {
            throw new IndexOutOfBoundsException("Start: " + start + ", End: " + end); // Validate indices
        }
        char[] subArray = new char[end - start]; // Create array for subsequence
        System.arraycopy(buffer, start, subArray, 0, end - start); // Copy subsequence
        return new MyTextBuffer(new String(subArray)); // Return new MyTextBuffer
    }

    /* Implements isEmpty method from CharSequence (Java 17) */
    @Override
    public boolean isEmpty() {
        return buffer.length == 0; // Return true if buffer is empty
    }

    /* Implements toString method for string representation */
    @Override
    public String toString() {
        return new String(buffer); // Convert buffer to string
    }

    /* Method to append text to the buffer */
    public void append(String text) {
        if (text == null) return; // Ignore null text
        char[] newText = text.toCharArray(); // Convert new text to char array
        char[] newBuffer = new char[buffer.length + newText.length]; // Create new buffer
        System.arraycopy(buffer, 0, newBuffer, 0, buffer.length); // Copy existing buffer
        System.arraycopy(newText, 0, newBuffer, buffer.length, newText.length); // Append new text
        this.buffer = newBuffer; // Update buffer
    }
}