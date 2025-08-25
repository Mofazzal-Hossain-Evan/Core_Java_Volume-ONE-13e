/* Package declaration to match directory structure */
package Meme_Quote_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 10) explains that ActionListener enables callback handling for timed events with javax.swing.Timer, allowing stateful objects like MemeQuotePrinter to manage dynamic outputs (Horstmann, p. 458). *Effective Java* (Item 24) recommends named listener classes for clarity and state management (Bloch, p. 124). Meme wisdom: This code's so funny, it might crash from laughter! */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;
import java.awt.Toolkit;

/* Class implementing ActionListener to print meme quotes on timer events */
public class MemeQuotePrinter implements ActionListener {
    private List<String> memeQuotes = Arrays.asList(
            "Distracted Boyfriend: Code compiles, but I forgot to test!",
            "Drake Meme: Rejects tabs, approves spaces!",
            "Success Kid: Fixed a bug on the first try!",
            "Grumpy Cat: Code review? More like code disapproval!",
            "Expanding Brain: Writing regex to parse regex!",
            "One Does Not Simply: Debug multithreaded code!",
            "Y U No: Compiler, just work already!"
    );
    private Random random = new Random();
    private Timer timer;

    /* Constructor takes the timer to allow stopping it */
    public MemeQuotePrinter(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Select random meme quote
        String quote = memeQuotes.get(random.nextInt(memeQuotes.size()));
        // Timestamp the quote using getWhen()
        long timestamp = e.getWhen();
        System.out.println("[" + timestamp + "] " + quote);
        // Add a beep for extra flair
        Toolkit.getDefaultToolkit().beep();
        System.out.println("BEEP! Meme delivered, brace for laughs!");
    }

    /* Method to stop the meme flow and show final message */
    public void stopMemes() {
        timer.stop();
        System.out.println("Meme machine powers down! You win, no more laughs!");
    }
}