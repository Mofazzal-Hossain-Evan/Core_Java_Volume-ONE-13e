/* Package declaration to match directory structure */
package Music_Playlist_Manager; // Defines the package for organization, matching the directory structure

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) discusses how classes like Song can be sorted using custom Comparators, enabling flexible ordering based on artist or duration without implementing Comparable (Horstmann, p. 258). */

/* Class representing a song with title, artist, and duration */
public class Song { // Declares the Song class to model a song with attributes
    private String title; // Private field to store the song's title
    private String artist; // Private field to store the song's artist
    private int duration; // Private field to store the song's duration in seconds

    /* Constructor */
    public Song(String title, String artist, int duration) { // Constructor to initialize a Song object
        this.title = title; // Assigns the provided title to the title field
        this.artist = artist; // Assigns the provided artist to the artist field
        this.duration = duration; // Assigns the provided duration to the duration field
    }

    /* Getters */
    public String getTitle() { // Getter method to access the title field
        return title; // Returns the title of the song
    }

    public String getArtist() { // Getter method to access the artist field
        return artist; // Returns the artist of the song
    }

    public int getDuration() { // Getter method to access the duration field
        return duration; // Returns the duration of the song
    }

    @Override
    public String toString() { // Overrides toString() to provide a string representation of the Song
        return title + " by " + artist + " (" + duration + "s)"; // Returns formatted string with title, artist, and duration
    }
}