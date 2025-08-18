/* Package declaration to match directory structure */
package File_Processor_System;

/* Theory: *Effective Java* (Item 20) suggests that classes like BinaryFileProcessor can rely on default methods without overriding, such as writeContent() throwing an exception for unsupported operations (Bloch, p. 109). */

/* Binary file processor implementation */
public class BinaryFileProcessor implements FileProcessor {
    private String content; // Simulating binary as string for demo

    public BinaryFileProcessor(String initialContent) {
        this.content = initialContent;
    }

    @Override
    public String readContent() {
        return content;
    }

    // Uses default writeContent() which throws UnsupportedOperationException

    // Uses default isReadable()

    // Uses default getMetadata()
}