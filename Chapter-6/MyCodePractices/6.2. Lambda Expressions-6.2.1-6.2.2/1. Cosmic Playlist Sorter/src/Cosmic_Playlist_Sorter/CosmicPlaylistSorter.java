/* Package declaration to match directory structure */
package Cosmic_Playlist_Sorter;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights lambda expressions for creating Comparators and ActionListeners, simplifying event handling and sorting in app-like contexts such as music players (Horstmann, p. 274). *Effective Java* (Item 42) advocates lambdas for functional interfaces to enhance code conciseness in event-driven simulations (Bloch, p. 200). */

/* Main class for cosmic playlist sorter */
public class CosmicPlaylistSorter {
    public static void main(String[] args) {
        /* Create quirky song playlist */
        Song[] playlist = {
                new Song("Galactic Code Jam", "Byte Bandits", 180),
                new Song("Binary Boogie", "Pixel Pioneers", 210),
                new Song("Quantum Groove", "Algo Avengers", 195),
                new Song("Nebula Notes", "Circuit Symphony", 225)
        };

        /* Sort by duration using lambda Comparator */
        Arrays.sort(playlist, (first, second) -> first.getDuration() - second.getDuration());
        System.out.println("Sorted by duration:");
        for (Song song : playlist) {
            System.out.println(song);
        }
        System.out.println();

        /* Sort by artist name using lambda Comparator */
        Arrays.sort(playlist, (first, second) -> first.getArtist().compareTo(second.getArtist()));
        System.out.println("Sorted by artist:");
        for (Song song : playlist) {
            System.out.println(song);
        }
        System.out.println();

        /* Simulate playback with Timer and lambda ActionListener */
        Timer timer = new Timer(3000, null); // 3 seconds delay
        int[] currentIndex = {0}; // Mutable index for cycling through playlist
        timer.addActionListener(event -> {
            System.out.println("Now playing: " + playlist[currentIndex[0]].getTitle() + " by " + playlist[currentIndex[0]].getArtist());
            currentIndex[0] = (currentIndex[0] + 1) % playlist.length;
        });
        timer.start();

        /* Display JOptionPane to stop playback */
        int option = JOptionPane.showConfirmDialog(
                null,
                "Exit the cosmic concert?",
                "Stop Playback",
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.YES_OPTION) {
            timer.stop();
            System.out.println("Playback stopped. Thanks for jamming!");
        } else {
            System.out.println("Continuing the cosmic vibes...");
            // Note: In a full app, this would keep running; here, main ends after dialog
        }
    }
}