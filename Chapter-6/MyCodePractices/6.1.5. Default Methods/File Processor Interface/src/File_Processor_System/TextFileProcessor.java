/* Package declaration to match directory structure */
package File_Processor_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that implementations like TextFileProcessor can override default methods (e.g., writeContent()) for specialized behavior while relying on others (e.g., isReadable()) (Horstmann, p. 262). */

/* Text file processor implementation */
public class TextFileProcessor implements FileProcessor {
    private String content;

    public TextFileProcessor(String initialContent) {
        this.content = initialContent;
    }

    @Override
    public String readContent() {
        return content;
    }

    @Override
    public void writeContent(String newContent) {
        this.content = newContent;
        System.out.println("Wrote new content: " + newContent);
    }

    // Uses default isReadable()

    // Uses default getMetadata()
}