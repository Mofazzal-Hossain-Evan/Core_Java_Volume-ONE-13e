/* Package declaration to match directory structure */
package File_Processor_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that default methods in interfaces like FileProcessor allow for optional operations and interface evolution without breaking existing implementations (Horstmann, p. 262). *Effective Java* (Item 20) recommends using default methods to provide convenience and maintain backward compatibility (Bloch, p. 109). */

/* Interface for file processors with default methods */
public interface FileProcessor {
    /* Abstract method to read content */
    String readContent();

    /* Default method for writing content that throws exception */
    default void writeContent(String content) {
        throw new UnsupportedOperationException("Writing not supported");
    }

    /* Default method to check if readable */
    default boolean isReadable() {
        return true;
    }

    /* New default method for getting metadata to simulate interface evolution */
    default String getMetadata() {
        return "No metadata available";
    }
}