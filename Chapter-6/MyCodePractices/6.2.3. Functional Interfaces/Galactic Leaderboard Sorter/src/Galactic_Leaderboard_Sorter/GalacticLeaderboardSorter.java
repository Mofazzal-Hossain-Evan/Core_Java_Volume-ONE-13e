/* Package declaration to match directory structure */
package Galactic_Leaderboard_Sorter;

import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights lambda expressions for creating
Comparators and ActionListeners, enabling concise sorting and event handling in
Android-inspired game leaderboards (Horstmann, p. 274). *Effective Java* (Item 42) advocates lambdas for functional interfaces to simplify code in event-driven systems (Bloch, p. 200). */

/* Main class for galactic leaderboard sorter */
public class GalacticLeaderboardSorter {
    public static void main(String[] args) {
        /* Create players with quirky nicknames */
        Player[] leaderboard = {
                new Player("Star Slinger", 1500, 10),
                new Player("Cosmic Coder", 2200, 8),
                new Player("Galaxy Glider", 1800, 12),
                new Player("Nebula Ninja", 2000, 9)
        };

        /* Sort by score (descending) using lambda Comparator */
        Arrays.sort(leaderboard, (p1, p2) -> p2.getScore() - p1.getScore());
        System.out.println("Leaderboard sorted by score (descending):");
        for (Player player : leaderboard) {
            System.out.println(player);
        }
        System.out.println();

        /* Sort by level using lambda Comparator */
        Arrays.sort(leaderboard, (p1, p2) -> p1.getLevel() - p2.getLevel());
        System.out.println("Leaderboard sorted by level:");
        for (Player player : leaderboard) {
            System.out.println(player);
        }
        System.out.println();

        /* Simulate real-time updates with Timer and lambda ActionListener */
        Timer timer = new Timer(2000, event -> System.out.println("Leaderboard refreshed at " + Instant.now()));
        timer.start();

        /* Display JOptionPane to stop updates */
        int option = JOptionPane.showConfirmDialog(
                null,
                "End the galactic showdown?",
                "Leaderboard Control",
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.YES_OPTION) {
            timer.stop();
            System.out.println("Galactic showdown ended!");
        } else {
            System.out.println("Leaderboard updates continue. Keep conquering the stars!");
            // Note: Main thread ends, but timer would continue in a real app
        }
    }
}