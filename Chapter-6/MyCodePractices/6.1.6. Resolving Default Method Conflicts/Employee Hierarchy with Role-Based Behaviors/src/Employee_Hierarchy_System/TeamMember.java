/* Package declaration to match directory structure */
package Employee_Hierarchy_System;

/* Theory: *Effective Java* (Item 21) discusses the importance of designing interfaces carefully to avoid conflicts in default methods when multiple interfaces are implemented (Bloch, p. 112). */

/* Interface TeamMember with default getRoleDescription */
public interface TeamMember {
    default String getRoleDescription() {
        return "Team Member: Collaborates with others on projects";
    }
}