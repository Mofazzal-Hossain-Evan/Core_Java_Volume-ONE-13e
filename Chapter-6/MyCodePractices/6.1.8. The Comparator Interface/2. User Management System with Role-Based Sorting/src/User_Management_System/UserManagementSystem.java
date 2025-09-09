/* Package declaration to match directory structure */
package User_Management_System; // Defines the package for organization, matching the directory structure

import java.util.Arrays; // Imports Arrays for sorting arrays

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes using Arrays.sort with custom Comparators in systems like UserManagementSystem for flexible user sorting, inspired by Jakarta EE's role-based security where roles are prioritized (Horstmann, p. 258). *Effective Java* (Item 14) recommends Comparators for multiple criteria in management systems (Bloch, p. 70). */

/* Main class for user management and sorting */
public class UserManagementSystem { // Declares the main UserManagementSystem class
    public static void main(String[] args) { // Main method to run the user management system
        /* Create users with various roles, including quirky ones */
        User[] users = new User[5]; // Initializes an array to hold 5 users
        users[0] = new User("alice", "User", "2025-01-01"); // Creates a User with username "alice", role "User"
        users[1] = new User("bob", "Admin", "2025-02-01"); // Creates a User with username "bob", role "Admin"
        users[2] = new User("charlie", "Code Ninja", "2025-03-01"); // Creates a User with username "charlie", quirky role "Code Ninja"
        users[3] = new User("dave", "Bug Slayer", "2025-04-01"); // Creates a User with username "dave", quirky role "Bug Slayer"
        users[4] = new User("eve", "User", "2025-05-01"); // Creates a User with username "eve", role "User"

        System.out.println("Original User List:"); // Prints header for original user list
        for (User user : users) { // Iterates through the users array
            System.out.println(user); // Prints each user using its toString() method
        }
        System.out.println(); // Prints a blank line for readability

        /* Sort by username alphabetically */
        Arrays.sort(users, new UsernameComparator()); // Sorts the users array using UsernameComparator
        System.out.println("User Dashboard: Sorted by Username"); // Prints header for username-sorted dashboard
        for (User user : users) { // Iterates through the sorted users array
            System.out.println(user); // Prints each user
        }
        System.out.println(); // Prints a blank line for readability

        /* Sort by role precedence (higher roles first), mimicking security prioritization */
        Arrays.sort(users, new RoleComparator()); // Sorts the users array using RoleComparator
        System.out.println("Admin Dashboard: Sorted by Role Precedence"); // Prints header for role-sorted dashboard, mimicking Jakarta EE security context
        for (User user : users) { // Iterates through the sorted users array
            System.out.println(user); // Prints each user
        }
    }
}