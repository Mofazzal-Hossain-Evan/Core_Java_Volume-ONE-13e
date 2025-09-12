/* Package declaration to match directory structure */
package Music_Playlist_Manager; // Defines the package for organization, matching the directory structure

import java.util.Arrays; // Imports Arrays for sorting arrays

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes using Arrays.sort with custom Comparators in apps like PlaylistManager to sort songs dynamically, mimicking Android media app playlist refresh (Horstmann, p. 258). *Effective Java* (Item 14) recommends Comparators for multiple criteria in media apps (Bloch, p. 70). */

/* Main class for playlist management and sorting */
public class PlaylistManager { // Declares the main PlaylistManager class
    public static void main(String[] args) { // Main method to run the playlist manager
        /* Create songs with funny titles */
        Song[] songs = new Song[4]; // Initializes an array to hold 4 songs
        songs[0] = new Song("Code All Night", "Tech Titans", 180); // Creates a Song with funny title "Code All Night", artist "Tech Titans", duration 180s
        songs[1] = new Song("Stack Overflow Blues", "Debuggers", 240); // Creates a Song with funny title "Stack Overflow Blues", artist "Debuggers", duration 240s
        songs[2] = new Song("Binary Boogie", "Byte Boppers", 150); // Creates a Song with funny title "Binary Boogie", artist "Byte Boppers", duration 150s
        songs[3] = new Song("Git Commit Jive", "Repo Rascals", 200); // Creates a Song with funny title "Git Commit Jive", artist "Repo Rascals", duration 200s

        System.out.println("Original Playlist:"); // Prints header for original playlist
        for (Song song : songs) { // Iterates through the songs array
            System.out.println(song); // Prints each song using its toString() method
        }
        System.out.println(); // Prints a blank line for readability

        /* Sort by artist alphabetically */
        Arrays.sort(songs, new ArtistComparator()); // Sorts the songs array using ArtistComparator
        System.out.println("Now Playing: Playlist Sorted by Artist"); // Prints header simulating Android playlist refresh for artist sort
        for (Song song : songs) { // Iterates through the sorted songs array
            System.out.println(song); // Prints each song
        }
        System.out.println(); // Prints a blank line for readability

        /* Sort by duration (shortest to longest) */
        Arrays.sort(songs, new DurationComparator()); // Sorts the songs array using DurationComparator
        System.out.println("Now Playing: Playlist Sorted by Duration"); // Prints header simulating Android playlist refresh for duration sort
        for (Song song : songs) { // Iterates through the sorted songs array
            System.out.println(song); // Prints each song
        }
    }
}