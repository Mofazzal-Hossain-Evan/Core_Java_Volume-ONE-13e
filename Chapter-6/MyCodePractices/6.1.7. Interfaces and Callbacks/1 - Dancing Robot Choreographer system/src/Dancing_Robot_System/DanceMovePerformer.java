/* Package declaration to match directory structure */
package Dancing_Robot_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 10) explains that ActionListener is a callback interface used with javax.swing.Timer to handle timed events, allowing objects like DanceMovePerformer to carry state (e.g., dance moves) and respond dynamically (Horstmann, p. 458). *Effective Java* (Item 24) advocates using classes over anonymous objects for listeners to maintain state and readability (Bloch, p. 124). Laugh while learning: This robot's dance moves are so slick, it might short-circuit from its own swagger! */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;

/* Class implementing ActionListener to perform dance moves on timer events */
public class DanceMovePerformer implements ActionListener {
    private List<String> danceMoves = Arrays.asList(
            "Robot does the Moonwalk!",
            "Robot spins like a disco ball!",
            "Robot pops and locks!",
            "Robot grooves to the Robot Rock!",
            "Robot twirls in a funky whirl!",
            "Robot breaks it down with breakdance!",
            "Robot shimmies with electric swagger!"
    );
    private int currentMoveIndex = 0;
    private Random random = new Random();
    private Timer timer;

    /* Constructor takes the timer to allow stopping it */
    public DanceMovePerformer(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get current dance move
        String move = danceMoves.get(currentMoveIndex);
        // Timestamp the move using getWhen()
        long timestamp = e.getWhen();
        System.out.println("[" + timestamp + "] " + move);

        // Move to next dance move, cycling back if needed
        currentMoveIndex = (currentMoveIndex + 1) % danceMoves.size();

        // Vary timer interval randomly (between 1000ms and 3000ms)
        int newDelay = 1000 + random.nextInt(2001); // 1-3 seconds
        timer.setDelay(newDelay);
        System.out.println("Next move in " + newDelay + "ms... keep grooving!");
    }

    /* Method to stop the dance and show final message */
    public void stopDance() {
        timer.stop();
        System.out.println("Robot takes a bow! Dance party over!");
    }
}