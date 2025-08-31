/* Package declaration to match directory structure */
package Karaoke_Party_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 10) highlights that javax.swing.Timer with ActionListener powers event-driven lyric prompts, perfect for a karaoke bash (Horstmann, p. 458). *Effective Java* (Item 24) supports named listener classes for stateful, readable callbacks (Bloch, p. 124). Karaoke vibe: This sim's so lit, even the speakers are singing! */

import javax.swing.JOptionPane;
import javax.swing.Timer;

/* Main class to run the karaoke party simulator */
public class KaraokePartySimulator {
    public static void main(String[] args) {
        // Initialize timer with 2000ms delay
        Timer karaokeTimer = new Timer(2000, null); // Listener added later
        KaraokeSinger singer = new KaraokeSinger(karaokeTimer);
        karaokeTimer.addActionListener(singer);

        // Start the karaoke party
        System.out.println("Karaoke party starts! Grab the mic and sing!");
        karaokeTimer.start();

        // Show JOptionPane to let user stop the karaoke
        JOptionPane.showConfirmDialog(null,
                "Karaoke in full swing! Click OK to end the sing-along?",
                "Karaoke Party",
                JOptionPane.OK_CANCEL_OPTION);

        // When OK is clicked, stop the timer and show final message
        singer.stopKaraoke();
    }
}