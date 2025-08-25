/* Package declaration to match directory structure */
package Meme_Quote_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 10) highlights that javax.swing.Timer with ActionListener powers event-driven hilarity, perfect for a meme quote generator (Horstmann, p. 458). *Effective Java* (Item 24) supports named listener classes for stateful, readable callbacks (Bloch, p. 124). Meme alert: This program's so lit, it might go viral! */

import javax.swing.JOptionPane;
import javax.swing.Timer;

/* Main class to run the meme quote generator */
public class MemeQuoteGenerator {
    public static void main(String[] args) {
        // Initialize timer with 3000ms delay
        Timer memeTimer = new Timer(3000, null); // Listener added later
        MemeQuotePrinter printer = new MemeQuotePrinter(memeTimer);
        memeTimer.addActionListener(printer);

        // Start the meme party
        System.out.println("Meme party begins! Get ready for epic quotes!");
        memeTimer.start();

        // Show JOptionPane to let user stop the memes
        JOptionPane.showConfirmDialog(null,
                "Memes incoming! Click OK to stop the laughs!",
                "Meme Quote Generator",
                JOptionPane.OK_CANCEL_OPTION);

        // When OK is clicked, stop the timer and show final message
        printer.stopMemes();
    }
}