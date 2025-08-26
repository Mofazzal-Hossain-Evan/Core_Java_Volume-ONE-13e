package Alien_Invasion_Alert_System;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class AlienInvasionTest {
    public static void main(String[] args) {
        // Create the alerter
        InvasionAlerter alerter = new InvasionAlerter();

        // Create a Timer (calls every 2 seconds)
        Timer timer = new Timer(2000, alerter);
        timer.start();

        // Ask user if they want peace treaty
        JOptionPane.showMessageDialog(null, "Negotiate peace with aliens? (Press OK to stop)");

        // If user clicks OK, stop the timer
        timer.stop();
        System.out.println("✅ Aliens made peace treaty. Invasion stopped!");
    }
}

