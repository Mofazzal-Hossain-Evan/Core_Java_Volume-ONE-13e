/* Package declaration to match directory structure */
package File_Processing_System;

/* Theory: *Effective Java* (Item 64) advocates using interfaces like TextProcessable for method parameters to maximize flexibility, allowing JSONFile to be processed alongside String or other implementations. This enables seamless integration with APIs expecting TextProcessable, unlike an abstract class which restricts subclasses to a single hierarchy (Bloch, p. 302). */

/* Class representing a JSON file implementing TextProcessable */
public class JSONFile implements TextProcessable {
    /* Internal string to store JSON content */
    private String content; // Content of the JSON file

    /* Constructor to initialize with JSON content */
    public JSONFile(String content) {
        this.content = (content != null) ? content : "{}"; // Initialize content, default to empty JSON
    }

    /* Implements readContent method from TextProcessable */
    @Override
    public String readContent() {
        return content; // Return the JSON content
    }

    /* Implements getLength method from TextProcessable */
    @Override
    public int getLength() {
        return content.length(); // Return length of content
    }

    /* Method to append JSON key-value pair */
    public void appendKeyValue(String key, String value) {
        if (key != null && value != null) {
            String newPair = "\"" + key + "\": \"" + value + "\""; // Format key-value pair
            content = content.substring(0, content.length() - 1) + // Remove closing brace
                    (content.equals("{}") ? "" : ",") + newPair + "}"; // Add pair and close JSON
        }
    }
}