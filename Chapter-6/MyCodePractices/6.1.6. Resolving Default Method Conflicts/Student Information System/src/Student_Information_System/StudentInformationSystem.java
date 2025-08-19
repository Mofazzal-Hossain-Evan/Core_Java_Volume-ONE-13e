/* Package declaration to match directory structure */
package Student_Information_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes superclass priority over interface defaults and the need to override for conflicts. For Object methods like toString(), defaults are allowed but may lead to conflicts if in multiple interfaces (Horstmann, p. 262). *Effective Java* (Item 20) warns about careful use of defaults to avoid unforeseen issues (Bloch, p. 109). */

/* Class containing main method for testing student classes */
public class StudentInformationSystem {
    public static void main(String[] args) {
        /* Test Student: superclass method wins */
        Student student = new Student();
        System.out.println("Student getName(): " + student.getName()); // From StudentBase
        System.out.println("Student toString(): " + student); // Uses Person's default toString()
        System.out.println();

        /* Test BasicStudent: override resolves interface conflict */
        BasicStudent basicStudent = new BasicStudent();
        System.out.println("BasicStudent getName(): " + basicStudent.getName()); // From Person's default
        System.out.println("BasicStudent toString(): " + basicStudent); // Uses Person's default toString()
        System.out.println();

        /* Demonstrate effect if Named had no default for getName() */
        // If Named was: String getName(); (abstract)
        // Then BasicStudent would compile without override, using Person's default
        // Student would still use StudentBase's getName()

        /* Note on toString(): Adding default toString() in another interface (e.g., Named) would cause conflict in BasicStudent and Student (since no superclass toString()), requiring override. This illustrates restrictions when dealing with Object methods in multiple interfaces. */
    }
}