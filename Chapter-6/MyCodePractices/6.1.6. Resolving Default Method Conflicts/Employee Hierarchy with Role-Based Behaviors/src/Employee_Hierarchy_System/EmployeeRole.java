/* Package declaration to match directory structure */
package Employee_Hierarchy_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes how interfaces can provide default methods, but conflicts arise when multiple interfaces define the same default method, requiring resolution in the implementing class (Horstmann, p. 261). */

/* Interface EmployeeRole with default getRoleDescription */
public interface EmployeeRole {
    default String getRoleDescription() {
        return "Employee Role: Responsible for individual tasks";
    }
}