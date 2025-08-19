/* Package declaration to match directory structure */
package Student_Information_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that without a superclass method, conflicting defaults from Person and Named require an override in BasicStudent (Horstmann, p. 261). Using Person.super.getName() resolves by choosing one. */

/* BasicStudent class implementing Person and Named, resolving conflict */
public class BasicStudent implements Person, Named {
    @Override
    public String getName() {
        return Person.super.getName();
        // Resolves conflict by using Person's default
    }
}