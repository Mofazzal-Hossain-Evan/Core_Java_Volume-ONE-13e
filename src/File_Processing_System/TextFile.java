/* Package declaration to match directory structure */
package File_Processing_System;

/* Theory: *Effective Java* (Item 20) emphasizes that interfaces like TextProcessable allow classes like TextFile to adopt behaviors without being tied to a single inheritance hierarchy. This enables TextFile to potentially implement other interfaces (e.g., CharSequence) and integrate with APIs expecting TextProcessable, offering greater flexibility than an abstract class (Bloch, p. 101). */

/* Class representing a plain text file implementing TextProcessable */
public class TextFile implements TextProcessable {
    /* Internal string to store file content */
    private String content; // Content of the text file

    /* Constructor to initialize with content */
    public TextFile(String content) {
        this.content = (content != null) ? content : ""; // Initialize content, default to empty
    }

    /* Implements readContent method from TextProcessable */
    @Override
    public String readContent() {
        return content; // Return the file content
    }

    /* Implements getLength method from TextProcessable */
    @Override
    public int getLength() {
        return content.length(); // Return length of content
    }

    /* Method to append text to the content */
    public void append(String text) {
        if (text != null) {
            content += text; // Append new text to existing content
        }
    }
}