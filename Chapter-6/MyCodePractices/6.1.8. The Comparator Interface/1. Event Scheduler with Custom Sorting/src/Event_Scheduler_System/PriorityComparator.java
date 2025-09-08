/* Package declaration to match directory structure */
package Event_Scheduler_System; // Defines the package for organization, matching the directory structure

import java.util.Comparator; // Imports the Comparator interface for custom sorting

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that Comparators like PriorityComparator can implement reverse ordering (high to low), using reversed comparison for flexibility in sorting (Horstmann, p. 258). */

/* Comparator to sort events by priority (high to low) */
public class PriorityComparator implements Comparator<Event> { // Declares PriorityComparator class implementing Comparator for Event objects
    @Override
    public int compare(Event e1, Event e2) { // Overrides compare() to define sorting logic
        return Integer.compare(e2.getPriority(), e1.getPriority()); // Compares priorities in reverse order (high to low) for descending sort
    }
}