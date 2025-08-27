/* Package declaration to match directory structure */
package Virtual_Pet_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 10) explains that ActionListener enables callback handling for timed events with javax.swing.Timer, allowing stateful objects like PetCaretaker to manage dynamic responses based on pet states (Horstmann, p. 458). *Effective Java* (Item 24) recommends named listener classes for clarity and state management (Bloch, p. 124). Pet wisdom: This virtual pet is needier than a binary cat demanding 1s and 0s! */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;
import java.awt.Toolkit;

/* Class implementing ActionListener to handle virtual pet demands */
public class PetCaretaker implements ActionListener {
    private List<String> demandTemplates = Arrays.asList(
            "Pet wants a snack!",
            "Pet demands belly rubs!",
            "Pet needs a walk!",
            "Pet begs for a toy!",
            "Pet whines for attention!"
    );
    private int hungerLevel; // 0 (full) to 10 (starving)
    private int happinessLevel; // 0 (sad) to 10 (ecstatic)
    private Random random = new Random();
    private Timer timer;

    /* Constructor initializes pet state and timer */
    public PetCaretaker(Timer timer) {
        this.timer = timer;
        this.hungerLevel = 5; // Neutral hunger
        this.happinessLevel = 5; // Neutral happiness
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update pet state: increase hunger, adjust happiness
        hungerLevel = Math.min(hungerLevel + 1, 10); // Hunger increases over time
        happinessLevel = Math.max(happinessLevel - 1, 0); // Happiness decreases if neglected

        // Select demand based on state and mood
        String demand = selectDemand();
        long timestamp = e.getWhen(); // Timestamp from event
        System.out.println("[" + timestamp + "] " + demand);

        // Add random beep or mood-based encouragement
        if (random.nextBoolean()) {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("BEEP! Pet yips with " + getMood() + " energy!");
        } else {
            System.out.println("Care for your pet! It's feeling " + getMood() + "!");
        }
    }

    /* Select demand based on pet state */
    private String selectDemand() {
        // If very hungry, prioritize food
        if (hungerLevel >= 8 && random.nextInt(3) > 0) {
            return "Pet is STARVING! Wants a snack NOW!";
        }
        // If very sad, prioritize attention
        if (happinessLevel <= 2 && random.nextInt(3) > 0) {
            return "Pet is SAD! Demands belly rubs or cuddles!";
        }
        // Otherwise, random demand
        return demandTemplates.get(random.nextInt(demandTemplates.size()));
    }

    /* Generate random mood for fun */
    private String getMood() {
        String[] moods = {"sassy", "grumpy", "playful", "needy", "chill"};
        return moods[random.nextInt(moods.length)];
    }

    /* Method to stop caring and show final message */
    public void stopCaring() {
        timer.stop();
        System.out.println("Pet curls up for a nap! Caretaking done!");
    }
}