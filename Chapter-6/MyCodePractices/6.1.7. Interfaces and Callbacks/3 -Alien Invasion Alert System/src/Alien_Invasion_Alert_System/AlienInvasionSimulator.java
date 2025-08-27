package Alien_Invasion_Alert_System;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

/* এই ক্লাসটি main method ধারণ করছে এবং সবকিছু চালায় */
public class AlienInvasionSimulator {
    public static void main(String[] args) {
        // Funny alien messages
        List<String> alienMessages = Arrays.asList(
                "UFO spotted over Pizza Planet!",
                "Aliens demand intergalactic tacos!",
                "Spaceship landing near local library!",
                "Alien sings karaoke on Earth!",
                "Asteroid misses Earth by 0.01 mm!",
                "Alien pets escaped from spaceship!"
        );

        // InvasionAlerter তৈরি
        InvasionAlerter alerter = new InvasionAlerter(alienMessages);

        // Timer: প্রতি 2 সেকেন্ডে এলিয়েন মেসেজ দেখাবে
        Timer timer = new Timer(2000, alerter);
        timer.start();

        // User prompt: শান্তি চুক্তি করা হবে কি?
        int response = JOptionPane.showConfirmDialog(
                null,
                "Negotiate peace with aliens?",
                "Alien Invasion Control",
                JOptionPane.OK_CANCEL_OPTION
        );

        // যদি ইউজার OK চাপেন, Timer বন্ধ করা হবে
        if (response == JOptionPane.OK_OPTION) {
            timer.stop();
            System.out.println("\nPeace negotiated. Aliens left happily with tacos!");
        } else {
            System.out.println("\nInvasion continues! Earth needs more superheroes!");
        }

        System.out.println("Simulation ended.");
    }
}
