/* Package declaration to match directory structure */
package Document_Management_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes resolving interface conflicts through overrides and the "class wins" rule for superclass methods. Making methods abstract ensures compatibility by forcing implementations where needed (Horstmann, p. 261). *Effective Java* (Item 21) warns about potential issues with multiple default methods but highlights abstracts for flexibility (Bloch, p. 112). */

/* Class containing main method for testing document classes */
public class DocumentManagement {
    public static void main(String[] args) {
        /* Test ReportWithConflict: override resolves conflict */
        ReportWithConflict reportConflict = new ReportWithConflict();
        System.out.println("ReportWithConflict getFormatString(): " + reportConflict.getFormatString());
        System.out.println();

        /* Test ReportWithSuperclass: superclass wins, no conflict */
        ReportWithSuperclass reportSuper = new ReportWithSuperclass();
        System.out.println("ReportWithSuperclass getFormatString(): " + reportSuper.getFormatString());
        System.out.println();

        /* Test ConcreteReport: implements abstract method */
        ConcreteReport concreteReport = new ConcreteReport();
        System.out.println("ConcreteReport getFormatString(): " + concreteReport.getFormatString());
        System.out.println();

        /* Demonstrate AbstractReport cannot be instantiated */
        // AbstractReport abstractReport = new AbstractReport(); // Compilation error: abstract class

        /* Note: If Stylable was also abstract, AbstractReport would still be abstract, and ConcreteReport would need to implement both if they were distinct methods, but since same signature, one implementation suffices. This ensures compatibility with older code by allowing gradual adoption. */
    }
}