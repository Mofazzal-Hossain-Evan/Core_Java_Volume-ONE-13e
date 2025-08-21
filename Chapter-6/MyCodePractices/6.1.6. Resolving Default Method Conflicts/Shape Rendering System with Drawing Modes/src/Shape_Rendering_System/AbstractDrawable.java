/* Package declaration to match directory structure */
package Shape_Rendering_System;

/* Theory: *Effective Java* (Item 20) advises that if one interface provides a
default and another declares the method abstract, no conflict occurs,
and the default is used (Bloch, p. 109). */

/* Interface with abstract getDisplayName to demonstrate no conflict */
public interface AbstractDrawable {
    String getDisplayName(); // Abstract, no default
}