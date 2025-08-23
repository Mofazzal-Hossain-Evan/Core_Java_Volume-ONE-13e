/* Package declaration to match directory structure */
package Document_Management_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that when implementing multiple interfaces with conflicting default methods, the class must override the method to resolve the conflict, potentially using super to invoke a specific default (Horstmann, p. 261). */

/* Report class implementing both interfaces, resolving conflict by overriding */
public class ReportWithConflict implements Formattable, Stylable {
    @Override
    public String getFormatString() {
        return Formattable.super.getFormatString() + " / " + Stylable.super.getFormatString(); // Resolve by combining both defaults
    }
}