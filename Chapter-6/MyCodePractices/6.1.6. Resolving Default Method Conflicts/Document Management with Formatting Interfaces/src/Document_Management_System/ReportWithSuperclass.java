/* Package declaration to match directory structure */
package Document_Management_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that the "class wins" rule means superclass methods override interface defaults, preventing conflicts even if interfaces have conflicting defaults (Horstmann, p. 261). */

/* Report class extending DocumentBase and implementing both interfaces, no override needed */
public class ReportWithSuperclass extends DocumentBase implements Formattable, Stylable {
    // No override; uses superclass getFormatString()
}