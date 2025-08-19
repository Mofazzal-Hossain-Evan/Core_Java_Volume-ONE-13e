/* Package declaration to match directory structure */
package Employee_Hierarchy_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that concrete methods in superclasses take precedence over default methods in interfaces, following the "class wins" rule (Horstmann, p. 261). */

/* Superclass Staff with concrete getRoleDescription */
public class Staff {
    public String getRoleDescription() {
        return "Staff: General company employee";
    }
}