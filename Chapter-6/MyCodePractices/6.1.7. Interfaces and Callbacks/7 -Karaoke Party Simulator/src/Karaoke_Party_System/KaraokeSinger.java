/* Package declaration to match directory structure */
package Karaoke_Party_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 10) explains that ActionListener enables callback handling for timed events with javax.swing.Timer, allowing stateful objects like KaraokeSinger to manage dynamic lyric outputs (Horstmann, p. 458). *Effective Java* (Item 24) recommends named listener classes for clarity and state management (Bloch, p. 124). Karaoke quip: These lyrics are so catchy, even the compiler's humming along! */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;
import java.awt.Toolkit;

/* Class implementing ActionListener to print karaoke lyrics on timer events */
public class KaraokeSinger implements ActionListener {
    private List<List<String>> songs = Arrays.asList(
            Arrays.asList(
                    "Bohemian Rhapsody: Is this the real life?",
                    "Bohemian Rhapsody: Or is this just fantasy?",
                    "Bohemian Rhapsody: Caught in a landslide!",
                    "Bohemian Rhapsody: No escape from reality!"
            ),
            Arrays.asList(
                    "Sweet Caroline: Where it began...",
                    "Sweet Caroline: I can't begin to knowin'!",
                    "Sweet Caroline: But then I know it's growin' strong!",
                    "Sweet Caroline: Sweet Caroline, bah bah bah!"
            ),
            Arrays.asList(
                    "I Will Survive: At first I was afraid...",
                    "I Will Survive: I was petrified!",
                    "I Will Survive: Kept thinkin' I could never live...",
                    "I Will Survive: But I survived!"
            )
    );
    private List<String> currentSong;
    private int currentLyricIndex = 0;
    private Random random = new Random();
    private Timer timer;

    /* Constructor takes the timer to allow stopping it */
    public KaraokeSinger(Timer timer) {
        this.timer = timer;
        // Randomly select a song to start
        this.currentSong = songs.get(random.nextInt(songs.size()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get current lyric
        String lyric = currentSong.get(currentLyricIndex);
        // Timestamp the lyric using getWhen()
        long timestamp = e.getWhen();
        System.out.println("[" + timestamp + "] " + lyric);

        // Move to next lyric, or switch to a new random song if done
        currentLyricIndex++;
        if (currentLyricIndex >= currentSong.size()) {
            currentLyricIndex = 0;
            currentSong = songs.get(random.nextInt(songs.size()));
            System.out.println("New song alert! Get ready to belt it out!");
        }

        // Add random beep or encouragement for party vibe
        if (random.nextBoolean()) {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("BEEP! Hit that high note, superstar!");
        } else {
            System.out.println("Sing it loud, karaoke king/queen!");
        }
    }

    /* Method to stop the karaoke and show final message */
    public void stopKaraoke() {
        timer.stop();
        System.out.println("Mic drop! Karaoke party over, take a bow!");
    }
}