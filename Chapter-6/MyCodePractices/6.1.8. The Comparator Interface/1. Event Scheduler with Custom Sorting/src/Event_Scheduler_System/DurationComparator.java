/* Package declaration to match directory structure */
package Event_Scheduler_System; // Defines the package for organization, matching the directory structure

import java.util.Comparator; // Imports the Comparator interface for custom sorting

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that Comparator implementations like DurationComparator allow custom sorting, such as by duration, ensuring consistency (e.g., return 0 for equals) to avoid sorting exceptions (Horstmann, p. 258). *Effective Java* (Item 14) stresses consistent comparators for proper ordering (Bloch, p. 70). */

/* Comparator to sort events by duration (shortest to longest) */
public class DurationComparator implements Comparator<Event> { // Declares DurationComparator class implementing Comparator for Event objects
    @Override
    public int compare(Event e1, Event e2) { // Overrides compare() to define sorting logic
        return Integer.compare(e1.getDuration(), e2.getDuration()); // Compares durations using Integer.compare for consistent ordering (returns 0 for equal durations)
    }
}