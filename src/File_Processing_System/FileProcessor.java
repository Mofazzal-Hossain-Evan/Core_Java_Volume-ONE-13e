// Package declaration should match the folder structure
package File_Processing_System;

/*
Theory:
Core Java (Vol I, 13th Edition, Chapter 6) discusses how interfaces like TextProcessable
enable flexible, polymorphic design (Horstmann, p. 252). Using interfaces allows us to process
any type that implements the interface, not just subclasses of a particular class.

Effective Java (Item 64) also advises to "Refer to objects by their interfaces" to allow 
for more flexible code (Bloch, p. 302). This means we can later replace implementations 
without changing the logic of FileProcessor.
*/

/**
 * Utility class to process any TextProcessable implementation.
 * Demonstrates polymorphism and interface-based design.
 */
public class FileProcessor {

    /**
     * Count number of words in a TextProcessable object.
     * @param file any object implementing TextProcessable
     * @return number of words
     */
    public static int countWords(TextProcessable file) {
        String content = file.readContent(); // Read text
        if (content == null || content.isEmpty()) return 0; // Handle null/empty
        return content.trim().split("\\s+").length; // Split on whitespace, count words
    }

    /**
     * Extract a specific line (1-based) from a TextProcessable.
     * @param file the object containing text
     * @param lineNumber line number to extract
     * @return the specific line or exception if invalid
     */
    public static String extractLine(TextProcessable file, int lineNumber) {
        String content = file.readContent(); // Read content
        if (content == null || content.isEmpty()) return ""; // Edge case
        String[] lines = content.split("\n"); // Split into lines
        if (lineNumber < 1 || lineNumber > lines.length) {
            throw new IllegalArgumentException("Invalid line number: " + lineNumber);
        }
        return lines[lineNumber - 1]; // Convert 1-based index to 0-based
    }

    /**
     * Main method to test interface-based processing and compare with class-based inheritance.
     */
    public static void main(String[] args) {

        // Create multiple TextProcessable implementations
        TextProcessable textFile = new TextFile("Hello\nWorld\nTest");         // from custom class
        TextProcessable csvFile = new CSVFile("name,age\nAlice,25\nBob,30");  // from custom class
        TextProcessable jsonFile = new JSONFile("{\"key\": \"value\"}");      // from custom class

        // Anonymous TextProcessable using lambda expression (Java 8+ feature)
        TextProcessable string = new TextProcessable() {
            @Override
            public String readContent() { return "Sample text\nLine two"; }

            @Override
            public int getLength() {
                return readContent().length();
            }
        };

        // ---- Testing polymorphic interface handling ----
        System.out.println("Testing TextProcessable processing:");

        System.out.println("TextFile content: " + textFile.readContent());
        System.out.println("  Word count: " + countWords(textFile));
        System.out.println("  Line 2: " + extractLine(textFile, 2));
        System.out.println("  Length: " + textFile.getLength());
        System.out.println();

        System.out.println("CSVFile content: " + csvFile.readContent());
        System.out.println("  Word count: " + countWords(csvFile));
        System.out.println("  Line 2: " + extractLine(csvFile, 2));
        System.out.println("  Length: " + csvFile.getLength());
        System.out.println();

        System.out.println("JSONFile content: " + jsonFile.readContent());
        System.out.println("  Word count: " + countWords(jsonFile));
        System.out.println("  Line 1: " + extractLine(jsonFile, 1));
        System.out.println("  Length: " + jsonFile.getLength());
        System.out.println();

        System.out.println("String content: " + string.readContent());
        System.out.println("  Word count: " + countWords(string));
        System.out.println("  Line 2: " + extractLine(string, 2));
        System.out.println("  Length: " + string.getLength());
        System.out.println();

        // Modify content using interface method (only possible if cast to correct type)
        ((TextFile) textFile).append("\nAppended"); // Modify TextFile content
        System.out.println("After appending to TextFile: " + textFile.readContent());
        System.out.println("  Word count: " + countWords(textFile));
        System.out.println();

        // ---- Now test class-based inheritance ----
        SimpleFileBase simpleFile = new SimpleFileBase("Base\nContent"); // Concrete class

        System.out.println("Testing FileBase with SimpleFileBase:");
        System.out.println("SimpleFileBase content: " + simpleFile.getContent());
        System.out.println("  Word count: " + simpleFile.countWords());
        System.out.println("  Line 2: " + simpleFile.extractLine(2));
        System.out.println();

        // Append new text and test again
        simpleFile.append("\nAppended Base");
        System.out.println("After appending to SimpleFileBase: " + simpleFile.getContent());
        System.out.println("  Word count: " + simpleFile.countWords());

        /*
        Theory:
        Effective Java (Item 18) warns that abstract classes like FileBase can lead to fragile base classes,
        where changes to FileBase affect all subclasses like SimpleFileBase. This can break subclasses unintentionally.

        In contrast, TextProcessable uses interface composition: classes adopt only what they need. This avoids
        inheriting unused or risky methods, and makes multiple inheritance possible.

        Core Java (Horstmann, p. 250) recommends favoring interfaces for flexibility and multiple-type capability.
        */
    }
}
