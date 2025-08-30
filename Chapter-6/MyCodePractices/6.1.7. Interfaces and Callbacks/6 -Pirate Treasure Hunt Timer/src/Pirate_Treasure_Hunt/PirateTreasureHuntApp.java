package Pirate_Treasure_Hunt;

import javax.swing.*;

public class PirateTreasureHuntApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TreasureFinder();  // Start the treasure hunt
        });
    }
}
