/* Package declaration to match directory structure */
package Task_List_Organizer; // Defines the package for organization, matching the directory structure

import java.util.Comparator; // Imports the Comparator interface for custom sorting
import java.util.HashMap; // Imports HashMap to store category precedence values
import java.util.Map; // Imports Map interface for category precedence mapping

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that Comparators like CategoryComparator can define custom order (e.g., Work > Personal), ensuring transitivity via consistent mapping, emulating priority in Android task apps (Horstmann, p. 258). */

/* Comparator to sort tasks by category in custom order (higher precedence first) */
public class CategoryComparator implements Comparator<Task> { // Declares CategoryComparator class implementing Comparator for Task objects
    private static final Map<String, Integer> categoryPrecedence = new HashMap<>(); // Static map to hold category precedence values (higher number = higher precedence)

    static { // Static initializer block to populate the category precedence map
        categoryPrecedence.put("Work", 2); // Assigns precedence 2 to "Work"
        categoryPrecedence.put("Personal", 1); // Assigns precedence 1 to "Personal"
    }

    @Override
    public int compare(Task t1, Task t2) { // Overrides compare() to define sorting logic
        Integer p1 = categoryPrecedence.getOrDefault(t1.getCategory(), 0); // Gets precedence for t1's category, default 0 if unknown
        Integer p2 = categoryPrecedence.getOrDefault(t2.getCategory(), 0); // Gets precedence for t2's category, default 0 if unknown
        return Integer.compare(p2, p1); // Compares precedences in descending order (higher precedence first)
    }
}