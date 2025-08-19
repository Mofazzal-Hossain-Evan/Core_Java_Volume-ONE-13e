/* Package declaration to match directory structure */
package Student_Information_System;

/* Theory: *Effective Java* (Item 21) discusses designing interfaces for posterity, noting that default methods help, but conflicts arise with multiple inheritance of behavior (Bloch, p. 112). */

/* Interface Named with default getName */
public interface Named {
    default String getName() {
        return "Named";
    }

    // default String toString() { return "Named: " + getName(); } // If uncommented, would cause conflict in classes implementing both Person and Named, requiring override
}