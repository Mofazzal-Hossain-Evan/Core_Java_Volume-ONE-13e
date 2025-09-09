/* Package declaration to match directory structure */
package User_Management_System; // Defines the package for organization, matching the directory structure

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) discusses how classes like User can be sorted using custom
 Comparators, enabling flexible ordering based on attributes like username or role without implementing Comparable
 (Horstmann, p. 258). */

/* Class representing a user with username, role, and registrationDate */
public class User { // Declares the User class to model a user with attributes
    private String username; // Private field to store the user's username
    private String role; // Private field to store the user's role (e.g., "Admin", "User", "Code Ninja")
    private String registrationDate; // Private field to store the registration date as a string (e.g., "2025-09-09")

    /* Constructor */
    public User(String username, String role, String registrationDate) { // Constructor to initialize a User object
        this.username = username; // Assigns the provided username to the username field
        this.role = role; // Assigns the provided role to the role field
        this.registrationDate = registrationDate; // Assigns the provided registration date to the registrationDate field
    }

    /* Getters */
    public String getUsername() { // Getter method to access the username field
        return username; // Returns the username of the user
    }

    public String getRole() { // Getter method to access the role field
        return role; // Returns the role of the user
    }

    public String getRegistrationDate() { // Getter method to access the registrationDate field
        return registrationDate; // Returns the registration date of the user
    }

    @Override
    public String toString() { // Overrides toString() to provide a string representation of the User
        return username + " (Role: " + role + ", Registered: " + registrationDate + ")"; // Returns formatted string with username, role, and registration date
    }
}