/* Package declaration to match directory structure */
package Document_Management_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that concrete methods in superclasses take precedence over default methods in interfaces, following the "class wins" rule (Horstmann, p. 261). */

/* Superclass DocumentBase with concrete getFormatString */
public class DocumentBase {
    public String getFormatString() {
        return "Base Format: Plain document";
    }
}