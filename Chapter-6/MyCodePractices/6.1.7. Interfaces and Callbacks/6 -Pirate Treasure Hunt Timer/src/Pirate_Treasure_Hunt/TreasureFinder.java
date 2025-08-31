package Pirate_Treasure_Hunt;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class TreasureFinder implements ActionListener {
    private List<String> clues;     // Pirate clues list
    private int clueIndex = 0;      // Current clue position
    private Timer timer;            // Swing Timer

    // Constructor
    public TreasureFinder() {
        clues = Arrays.asList(
                "X marks the spot near Davy Jones’ Locker! ☠️",
                "Follow the parrot’s squawk, matey! 🦜",
                "The rum barrels hide a secret passage! 🍺",
                "A black flag flies where the gold lies! 🏴‍☠️",
                "The sea shanty guides ye to the chest! 🎶"
        );
        // Timer fires every 3 seconds
        timer = new Timer(3000, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Show next clue
        if (clueIndex < clues.size()) {
            Toolkit.getDefaultToolkit().beep();  // ship bell
            System.out.println("[" + new Date(e.getWhen()) + "] " + clues.get(clueIndex));
            clueIndex++;
        } else {
            timer.stop();
            endHunt();
        }
    }

    // Piratey ending
    private void endHunt() {
        int choice = JOptionPane.showConfirmDialog(
                null,
                "Abandon the treasure, matey? ⚓️",
                "End of the Hunt",
                JOptionPane.YES_NO_CANCEL_OPTION
        );

        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("🏴‍☠️ The hunt ends here. No treasure for ye, landlubber!");
        } else {
            System.out.println("Arrr! The hunt continues across the seven seas!");
            clueIndex = 0; // Reset clues
            timer.start();
        }
    }
}
