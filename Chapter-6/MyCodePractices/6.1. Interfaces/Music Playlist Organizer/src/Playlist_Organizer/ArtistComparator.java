package Playlist_Organizer;

import java.util.Comparator;

public class ArtistComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        return s1.getArtist().compareToIgnoreCase(s2.getArtist());
    }
}
