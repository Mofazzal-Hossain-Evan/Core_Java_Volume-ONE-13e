/* Package declaration to match directory structure */
package File_Processing_System;

/* Theory: *Effective Java* (Item 18) warns that abstract classes like FileBase can lead to fragile base classes, where changes to FileBase affect all subclasses like SimpleFileBase. Unlike TextProcessable, which allows classes to adopt only needed behaviors, SimpleFileBase inherits all FileBase methods, potentially including unused ones (Bloch, p. 90). */

/* Concrete class extending FileBase for comparison */
public class SimpleFileBase extends FileBase {
    /* Internal string to store file content */
    private String content; // Content of the file

    /* Constructor to initialize with content */
    public SimpleFileBase(String content) {
        this.content = (content != null) ? content : ""; // Initialize content, default to empty
    }

    /* Implements getContent method from FileBase */
    @Override
    public String getContent() {
        return content; // Return stored content
    }

    /* Method to append text */
    public void append(String text) {
        if (text != null) {
            content += text; // Append new text to existing content
        }
    }
}