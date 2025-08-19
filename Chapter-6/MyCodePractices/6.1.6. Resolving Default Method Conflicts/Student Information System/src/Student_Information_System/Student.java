/* Package declaration to match directory structure */
package Student_Information_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that since StudentBase provides getName(), it takes precedence over defaults from Person and Named, avoiding conflict (Horstmann, p. 261). */

/* Student class extending StudentBase and implementing Person and Named */
public class Student extends StudentBase implements Person, Named {
    // No override needed; superclass getName() wins
}