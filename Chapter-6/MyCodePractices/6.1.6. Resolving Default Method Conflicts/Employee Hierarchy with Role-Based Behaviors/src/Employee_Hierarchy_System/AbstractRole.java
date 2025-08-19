/* Package declaration to match directory structure */
package Employee_Hierarchy_System;

/* Theory: *Effective Java* (Item 20) advises that if one interface provides a default and another declares the method abstract, no conflict occurs, and the default is used (Bloch, p. 109). */

/* Interface with abstract getRoleDescription to demonstrate no conflict */
public interface AbstractRole {
    String getRoleDescription(); // Abstract, no default
}