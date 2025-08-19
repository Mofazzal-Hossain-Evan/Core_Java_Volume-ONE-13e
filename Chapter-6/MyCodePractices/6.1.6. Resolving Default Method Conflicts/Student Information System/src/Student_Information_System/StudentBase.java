/* Package declaration to match directory structure */
package Student_Information_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that superclass methods take priority over interface default methods (Horstmann, p. 261). */

/* Base class for students with concrete getName */
public class StudentBase {
    public String getName() {
        return "From StudentBase";
    }
}