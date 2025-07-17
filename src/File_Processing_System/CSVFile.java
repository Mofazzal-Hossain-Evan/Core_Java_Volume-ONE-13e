/* Package declaration to match directory structure */
package File_Processing_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that interfaces allow classes like CSVFile to implement a common contract (TextProcessable) while providing specialized behavior, such as CSV-specific formatting. This polymorphism enables FileProcessor to process CSVFile alongside other types, unlike an abstract class which would require a single inheritance hierarchy (Horstmann, p. 252). */

/* Class representing a CSV file implementing TextProcessable */
public class CSVFile implements TextProcessable {
    /* Internal string to store CSV content */
    private String content; // Content of the CSV file

    /* Constructor to initialize with CSV content */
    public CSVFile(String content) {
        this.content = (content != null) ? content : ""; // Initialize content, default to empty
    }

    /* Implements readContent method from TextProcessable */
    @Override
    public String readContent() {
        return content; // Return the CSV content
    }

    /* Implements getLength method from TextProcessable */
    @Override
    public int getLength() {
        return content.length(); // Return length of content
    }

    /* Method to add a CSV row */
    public void addRow(String row) {
        if (row != null) {
            content += (content.isEmpty() ? "" : "\n") + row; // Append row with newline if needed
        }
    }
}