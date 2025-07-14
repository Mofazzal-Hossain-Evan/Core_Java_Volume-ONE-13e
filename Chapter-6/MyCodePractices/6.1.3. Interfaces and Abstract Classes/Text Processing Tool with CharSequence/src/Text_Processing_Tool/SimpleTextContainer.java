/* Package declaration to match directory structure */
package Text_Processing_Tool;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 5) explains that concrete subclasses like SimpleTextContainer must provide implementations for abstract methods defined in the parent abstract class. However, because Java supports single inheritance, SimpleTextContainer cannot extend another class (e.g., String), limiting its ability to integrate with existing types compared to CharSequence implementations, which can be used in any context expecting a CharSequence (Horstmann, p. 210). */

/* Concrete class extending TextContainer for comparison */
public class SimpleTextContainer extends TextContainer {
    /* Internal string to store text */
    private String text; // Text content

    /* Constructor to initialize with a string */
    public SimpleTextContainer(String text) {
        this.text = (text != null) ? text : ""; // Initialize text, default to empty
    }

    /* Implements getText method from TextContainer */
    @Override
    public String getText() {
        return text; // Return stored text
    }

    /* Method to append text */
    public void append(String newText) {
        if (newText != null) {
            text += newText; // Append new text to existing
        }
    }
}