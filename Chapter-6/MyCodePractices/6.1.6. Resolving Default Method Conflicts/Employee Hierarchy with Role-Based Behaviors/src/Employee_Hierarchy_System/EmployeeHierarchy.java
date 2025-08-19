/* Package declaration to match directory structure */
package Employee_Hierarchy_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes resolving interface conflicts through overrides and the "class wins" rule for superclass methods. No conflict if one method is abstract (Horstmann, p. 261). *Effective Java* (Item 21) warns about potential issues with multiple default methods (Bloch, p. 112). */

/* Class containing main method for testing employee classes */
public class EmployeeHierarchy {
    public static void main(String[] args) {
        /* Test EngineerWithConflict: override resolves conflict */
        EngineerWithConflict engineerConflict = new EngineerWithConflict();
        System.out.println("EngineerWithConflict getRoleDescription(): " + engineerConflict.getRoleDescription());
        System.out.println();

        /* Test EngineerWithSuperclass: superclass wins, no conflict */
        EngineerWithSuperclass engineerSuper = new EngineerWithSuperclass();
        System.out.println("EngineerWithSuperclass getRoleDescription(): " + engineerSuper.getRoleDescription());
        System.out.println();

        /* Test EngineerWithAbstract: no conflict, uses default from EmployeeRole */
        EngineerWithAbstract engineerAbstract = new EngineerWithAbstract();
        System.out.println("EngineerWithAbstract getRoleDescription(): " + engineerAbstract.getRoleDescription());
        System.out.println();

        /* Note: If both interfaces were abstract (no defaults), compilation would fail without an override in the class, as no implementation would be provided. */
    }
}