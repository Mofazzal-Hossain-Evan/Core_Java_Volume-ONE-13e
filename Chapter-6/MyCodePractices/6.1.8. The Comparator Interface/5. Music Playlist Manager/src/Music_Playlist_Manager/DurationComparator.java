/* Package declaration to match directory structure */
package Music_Playlist_Manager; // Defines the package for organization, matching the directory structure

import java.util.Comparator; // Imports the Comparator interface for custom sorting

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that Comparators like DurationComparator can sort numerically, ensuring transitivity (if a<=b and b<=c then a<=c) to avoid Timsort issues in playlist sorting (Horstmann, p. 258). */

/* Comparator to sort songs by duration (shortest to longest) */
public class DurationComparator implements Comparator<Song> { // Declares DurationComparator class implementing Comparator for Song objects
    @Override
    public int compare(Song s1, Song s2) { // Overrides compare() to define sorting logic
        return Integer.compare(s1.getDuration(), s2.getDuration()); // Compares durations using Integer.compare for ascending order
    }
}