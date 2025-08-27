/* Package declaration to match directory structure */
package Virtual_Pet_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 10) highlights that javax.swing.Timer with ActionListener powers event-driven pet demands, perfect for a needy virtual companion (Horstmann, p. 458). *Effective Java* (Item 24) supports named listener classes for stateful, readable callbacks (Bloch, p. 124). Pet alert: This virtual pet's so clingy, it might follow you into your IDE! */

import javax.swing.JOptionPane;
import javax.swing.Timer;

/* Main class to run the virtual pet caretaker */
public class VirtualPetCaretaker {
    public static void main(String[] args) {
        // Initialize timer with 4000ms delay
        Timer petTimer = new Timer(4000, null); // Listener added later
        PetCaretaker caretaker = new PetCaretaker(petTimer);
        petTimer.addActionListener(caretaker);

        // Start the pet care
        System.out.println("Virtual pet awakens! It's ready to demand ALL your attention!");
        petTimer.start();

        // Show JOptionPane to let user stop caring
        JOptionPane.showConfirmDialog(null,
                "Pet's demanding care! Click OK to stop?",
                "Virtual Pet Caretaker",
                JOptionPane.OK_CANCEL_OPTION);

        // When OK is clicked, stop the timer and show final message
        caretaker.stopCaring();
    }
}