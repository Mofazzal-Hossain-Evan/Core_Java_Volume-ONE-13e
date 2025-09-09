/* Package declaration to match directory structure */
package User_Management_System; // Defines the package for organization, matching the directory structure

import java.util.Comparator; // Imports the Comparator interface for custom sorting

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that Comparator
implementations like UsernameComparator allow alphabetical sorting, adhering to reflexivity
(compare(x,x)=0) and antisymmetry (sign(compare(x,y)) = -sign(compare(y,x))) for consistent ordering
 (Horstmann, p. 258). *Effective Java* (Item 14) stresses consistent comparators (Bloch, p. 70). */

/* Comparator to sort users alphabetically by username */
public class UsernameComparator implements Comparator<User> { // Declares UsernameComparator class implementing Comparator for User objects
    @Override
    public int compare(User u1, User u2) { // Overrides compare() to define sorting logic
        return u1.getUsername().compareTo(u2.getUsername()); // Compares usernames alphabetically using String's compareTo
    }
}