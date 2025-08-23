/* Package declaration to match directory structure */
package Document_Management_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes how interfaces can provide default methods, but conflicts arise when multiple interfaces define the same default method, requiring resolution in the implementing class (Horstmann, p. 261). */

/* Interface Formattable with default getFormatString */
public interface Formattable {
    default String getFormatString() {
        return "Formatted: Standard style";
    }
}