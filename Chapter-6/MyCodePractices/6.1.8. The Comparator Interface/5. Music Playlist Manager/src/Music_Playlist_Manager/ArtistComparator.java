/* Package declaration to match directory structure */
package Music_Playlist_Manager; // Defines the package for organization, matching the directory structure

import java.util.Comparator; // Imports the Comparator interface for custom sorting

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that Comparator implementations like ArtistComparator allow alphabetical sorting, ensuring reflexivity (compare(x,x)=0) and antisymmetry for consistent ordering (Horstmann, p. 258). *Effective Java* (Item 14) stresses consistent comparators (Bloch, p. 70). */

/* Comparator to sort songs alphabetically by artist */
public class ArtistComparator implements Comparator<Song> { // Declares ArtistComparator class implementing Comparator for Song objects
    @Override
    public int compare(Song s1, Song s2) { // Overrides compare() to define sorting logic
        return s1.getArtist().compareTo(s2.getArtist()); // Compares artist names alphabetically using String's compareTo
    }
}