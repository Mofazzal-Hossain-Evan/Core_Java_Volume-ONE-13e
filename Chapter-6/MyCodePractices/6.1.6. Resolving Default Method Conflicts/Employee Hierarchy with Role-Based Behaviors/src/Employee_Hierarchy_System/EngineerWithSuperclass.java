/* Package declaration to match directory structure */
package Employee_Hierarchy_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that the "class wins" rule means superclass methods override interface defaults, preventing conflicts even if interfaces have conflicting defaults (Horstmann, p. 261). */

/* Engineer class extending Staff and implementing both interfaces, no override needed */
public class EngineerWithSuperclass extends Staff implements EmployeeRole, TeamMember {
    // No override; uses superclass getRoleDescription()
}