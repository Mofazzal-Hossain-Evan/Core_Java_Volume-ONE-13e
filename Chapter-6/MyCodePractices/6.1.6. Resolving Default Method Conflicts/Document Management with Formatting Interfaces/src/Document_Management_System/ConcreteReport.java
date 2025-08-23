/* Package declaration to match directory structure */
package Document_Management_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that a concrete subclass must implement all abstract methods from superclasses or interfaces (Horstmann, p. 261). */

/* Concrete subclass of AbstractReport implementing the abstract method */
public class ConcreteReport extends AbstractReport {
    @Override
    public String getFormatString() {
        return "Concrete Format: Implemented in subclass";
    }
}