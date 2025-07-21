/* Package declaration to match directory structure */
package File_Processing_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 5) explains that abstract classes like FileBase provide shared code but limit subclasses to single inheritance, making them less flexible than interfaces for handling diverse file types. Subclasses must inherit all methods, even if not needed, unlike TextProcessable which allows selective implementation (Horstmann, p. 208). */

/* Abstract class for comparison, providing file processing methods */
public abstract class FileBase {
    /* Abstract method to get the file content */
    public abstract String getContent();

    /* Counts the number of words in the content */
    public int countWords() {
        String content = getContent(); // Get content from subclass
        if (content == null || content.isEmpty()) return 0; // Return 0 for null or empty
        return content.trim().split("\\s+").length; // Split by whitespace and count words
    }

    /* Extracts a specific line by index (1-based) */
    public String extractLine(int lineNumber) {
        String content = getContent(); // Get content from subclass
        if (content == null || content.isEmpty()) return ""; // Return empty for null or empty
        String[] lines = content.split("\n"); // Split content into lines
        if (lineNumber < 1 || lineNumber > lines.length) {
            throw new IllegalArgumentException("Invalid line number: " + lineNumber); // Validate line number
        }
        return lines[lineNumber - 1]; // Return requested line
    }
}