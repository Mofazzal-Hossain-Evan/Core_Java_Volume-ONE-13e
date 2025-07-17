/* Package declaration to match directory structure */
package File_Processing_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that interfaces like TextProcessable enable polymorphism by defining a contract that multiple classes can implement, allowing methods to process diverse types without knowing their implementation details. This is similar to CharSequence, which String and StringBuilder implement, enabling flexible text processing (Horstmann, p. 250). Interfaces support multiple inheritance, unlike abstract classes, making them ideal for handling varied file types. */

/* Interface for processing text-based file content */
public interface TextProcessable {
    /* Declares method to read the file's content as a string */
    String readContent();

    /* Declares method to get the length of the content */
    int getLength();
}