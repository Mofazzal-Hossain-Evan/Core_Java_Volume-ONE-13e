/* Package declaration to match directory structure */
package Document_Management_System;

/* Theory: *Effective Java* (Item 20) advises that if one interface provides a default and another declares the method abstract, no conflict occurs, and the default is used (Bloch, p. 109). */

/* Interface with abstract getFormatString to demonstrate no conflict when mixed with default */
public interface AbstractFormattable {
    String getFormatString(); // Abstract, no default
}