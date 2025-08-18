/* Package declaration to match directory structure */
package File_Processor_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes that default methods enable interface evolution, such as adding getMetadata(), without requiring updates to existing implementations like BinaryFileProcessor, ensuring backward compatibility (Horstmann, p. 262). *Effective Java* (Item 20) highlights defaults for optional operations and overrides where needed (Bloch, p. 109). */

/* Class containing main method for testing FileProcessor implementations */
public class FileProcessingSystem {
    public static void main(String[] args) {
        /* Create TextFileProcessor instance */
        FileProcessor textProcessor = new TextFileProcessor("Initial text content");
        System.out.println("Testing TextFileProcessor (overrides writeContent, uses defaults for others):");
        System.out.println("Read content: " + textProcessor.readContent());
        System.out.println("Is readable? " + textProcessor.isReadable()); // Uses default isReadable()
        textProcessor.writeContent("New text content"); // Uses overridden writeContent()
        System.out.println("Read after write: " + textProcessor.readContent());
        System.out.println("Metadata: " + textProcessor.getMetadata()); // Uses default getMetadata()
        System.out.println();

        /* Create BinaryFileProcessor instance */
        FileProcessor binaryProcessor = new BinaryFileProcessor("Initial binary content");
        System.out.println("Testing BinaryFileProcessor (uses all default methods except readContent):");
        System.out.println("Read content: " + binaryProcessor.readContent());
        System.out.println("Is readable? " + binaryProcessor.isReadable()); // Uses default isReadable()
        try {
            binaryProcessor.writeContent("New binary content"); // Uses default writeContent(), expects exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Write failed as expected: " + e.getMessage());
        }
        System.out.println("Metadata: " + binaryProcessor.getMetadata()); // Uses default getMetadata()
        System.out.println();

        /* Demonstrate interface evolution: getMetadata() added as default, compatible with both implementations */
        System.out.println("Demonstrating interface evolution with getMetadata():");
        System.out.println("TextFileProcessor metadata (default): " + textProcessor.getMetadata());
        System.out.println("BinaryFileProcessor metadata (default): " + binaryProcessor.getMetadata());
    }
}