/* Package declaration to match directory structure */
package Document_Management_System;

/* Theory: *Effective Java* (Item 21) discusses the importance of designing interfaces carefully to avoid conflicts in default methods when multiple interfaces are implemented (Bloch, p. 112). */

/* Interface Stylable with default getFormatString */
public interface Stylable {
    default String getFormatString() {
        return "Styled: Fancy design";
    }
}