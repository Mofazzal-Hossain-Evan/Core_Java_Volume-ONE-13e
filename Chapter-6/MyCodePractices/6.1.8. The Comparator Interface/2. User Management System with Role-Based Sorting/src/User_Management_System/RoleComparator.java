/* Package declaration to match directory structure */
package User_Management_System; // Defines the package for organization, matching the directory structure

import java.util.Comparator; // Imports the Comparator interface for custom sorting
import java.util.HashMap; // Imports HashMap to store role precedence values
import java.util.Map; // Imports Map interface for role precedence mapping

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that Comparators like RoleComparator can define custom precedence (e.g., Admin > User), ensuring reflexivity and antisymmetry by consistent mapping, mimicking role-based security in Jakarta EE (Horstmann, p. 258). */

/* Comparator to sort users by role precedence (higher precedence first) */
public class RoleComparator implements Comparator<User> { // Declares RoleComparator class implementing Comparator for User objects
    private static final Map<String, Integer> rolePrecedence = new HashMap<>(); // Static map to hold role precedence values (higher number = higher precedence)

    static { // Static initializer block to populate the role precedence map
        rolePrecedence.put("Admin", 4); // Assigns precedence 4 to "Admin"
        rolePrecedence.put("Code Ninja", 3); // Assigns precedence 3 to "Code Ninja" (quirky role)
        rolePrecedence.put("Bug Slayer", 2); // Assigns precedence 2 to "Bug Slayer" (quirky role)
        rolePrecedence.put("User", 1); // Assigns precedence 1 to "User"
    }

    @Override
    public int compare(User u1, User u2) { // Overrides compare() to define sorting logic
        Integer p1 = rolePrecedence.getOrDefault(u1.getRole(), 0); // Gets precedence for u1's role, default 0 if unknown
        Integer p2 = rolePrecedence.getOrDefault(u2.getRole(), 0); // Gets precedence for u2's role, default 0 if unknown
        return Integer.compare(p2, p1); // Compares precedences in descending order (higher precedence first)
    }
}