package Playlist_Organizer;

import java.util.Comparator;

public class RatingComparator implements Comparator<Song> {
    public int compare(Song s1, Song s2){
        int ratingCompare= Double.compare(s2.getRating(),s1.getRating());
        if (ratingCompare == 0){
            return s1.getTitle().compareToIgnoreCase(s2.getTitle());
        }

        return ratingCompare;
    }
}
