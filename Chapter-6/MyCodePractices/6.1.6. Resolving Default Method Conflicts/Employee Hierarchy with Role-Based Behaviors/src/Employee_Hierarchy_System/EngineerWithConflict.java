/* Package declaration to match directory structure */
package Employee_Hierarchy_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that when implementing multiple interfaces with conflicting default methods, the class must override the method to resolve the conflict, potentially using super to invoke a specific default (Horstmann, p. 261). */

/* Engineer class implementing both interfaces, resolving conflict by overriding */
public class EngineerWithConflict implements EmployeeRole, TeamMember {
    @Override
    public String getRoleDescription() {
        // Resolve by combining both defaults
        return EmployeeRole.super.getRoleDescription() + " and " + TeamMember.super.getRoleDescription();
    }
}