package Simple_Music_Playlist;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class MusicPlaylist {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
                new Song("Song A", 240, 4.5),
                new Song("Song B", 310, 3.8),
                new Song("Song C", 200, 4.9),
                new Song("Song D", 180, 4.2)
        );

        // filter + sort using Lambda
        songs.stream()
                .filter(s -> s.getDuration() < 300) // Predicate Lambda
                .sorted((s1, s2) -> Double.compare(s2.getRating(), s1.getRating())) // Comparator Lambda
                .forEach(System.out::println); // Consumer Lambda
    }
}