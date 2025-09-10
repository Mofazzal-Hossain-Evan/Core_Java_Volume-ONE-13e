/* Package declaration to match directory structure */
package Task_List_Organizer; // Defines the package for organization, matching the directory structure

import java.util.Comparator; // Imports the Comparator interface for custom sorting

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that Comparator implementations like DueDateComparator allow chronological sorting, following transitivity (if a<=b and b<=c then a<=c) to prevent sort errors in Timsort (Horstmann, p. 258). *Effective Java* (Item 14) stresses consistent comparators (Bloch, p. 70). */

/* Comparator to sort tasks by due date (earliest first) */
public class DueDateComparator implements Comparator<Task> { // Declares DueDateComparator class implementing Comparator for Task objects
    @Override
    public int compare(Task t1, Task t2) { // Overrides compare() to define sorting logic
        return t1.getDueDate().compareTo(t2.getDueDate()); // Compares due dates chronologically using String's compareTo (assumes YYYY-MM-DD format)
    }
}