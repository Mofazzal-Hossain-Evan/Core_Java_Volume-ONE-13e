/* Package declaration to match directory structure */
package Document_Management_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) states that if a class implements interfaces with abstract methods and does not provide implementations, it must be declared abstract (Horstmann, p. 261). */

/* Abstract Report class implementing AbstractFormattable and Stylable, no implementation for abstract method */
public abstract class AbstractReport implements AbstractFormattable, Stylable {
    @Override
    public String getFormatString() {
        return "";
    }
    // No implementation for getFormatString(); class is abstract
    // Note: Stylable's default is ignored for getFormatString() since AbstractFormattable declares it abstract
}