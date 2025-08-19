/* Package declaration to match directory structure */
package Student_Information_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes how interfaces can provide default methods, but when implementing multiple interfaces with conflicting defaults, the class must override to resolve (Horstmann, p. 261). */

/* Interface Person with default getName and toString */
public interface Person {
    default String getName() {
        return "";
    }

    default String toString() {
        return "Person: " + getName();
    } // Default toString() is allowed and used if not overridden in the class
}