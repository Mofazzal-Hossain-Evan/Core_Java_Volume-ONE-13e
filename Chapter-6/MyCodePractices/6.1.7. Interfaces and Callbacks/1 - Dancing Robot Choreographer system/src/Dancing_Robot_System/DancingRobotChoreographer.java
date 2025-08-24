/* Package declaration to match directory structure */
package Dancing_Robot_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 10) highlights that javax.swing.Timer with ActionListener enables event-driven programming for timed actions, perfect for a dancing robot's funky schedule (Horstmann, p. 458). *Effective Java* (Item 24) supports named listener classes for clarity and state management (Bloch, p. 124). Fun fact: This robot dances like nobody's watching, but everybody's timing! */

import javax.swing.JOptionPane;
import javax.swing.Timer;

/* Main class to run the dancing robot choreographer */
public class DancingRobotChoreographer {
    public static void main(String[] args) {
        // Initialize timer with initial 2000ms delay
        Timer danceTimer = new Timer(2000, null); // Listener added later
        DanceMovePerformer performer = new DanceMovePerformer(danceTimer);
        danceTimer.addActionListener(performer);

        // Start the dance party
        System.out.println("Dance party starts! Robot's getting funky!");
        danceTimer.start();

        // Show JOptionPane to let user stop the dance
        JOptionPane.showConfirmDialog(null,
                "Robot's dancing! Click OK to stop the groove!",
                "Dancing Robot",
                JOptionPane.OK_CANCEL_OPTION);

        // When OK is clicked, stop the timer and show final message
        performer.stopDance();
    }
}