/* Package declaration to match directory structure */
package Dice_Roller_Game_Simulator;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/* থিয়রি: *Core Java* (Volume I, 13th Edition, Chapter 6) বলে, Supplier লেজি ইভ্যালুয়েশনের জন্য, IntUnaryOperator অ্যারে ইনিশিয়ালাইজেশনের জন্য, এবং Predicate ফিল্টারিং-এ গেম লজিকে সাহায্য করে (Horstmann, p. 274). *Effective Java* (Item 42) বলে, ল্যামডা এই ইন্টারফেসগুলোর জন্য কোড সিম্পল করে (Bloch, p. 200). */

/* Main class for dice roller game simulator */
public class DiceRollerGameSimulator {
    public static void main(String[] args) {
        /* Initialize dice with quirky modifier */
        DiceRoll d6 = new DiceRoll(6, 0); // Standard d6
        DiceRoll d20WithLuck = new DiceRoll(20, new Random().nextInt(5) + 1); // Luck Potion boost 1-5

        /* Supplier for lazy random roll generation */
        Supplier<Integer> rollSupplier = () -> (int) (Math.random() * d6.getSides()) + 1;

        /* IntUnaryOperator for modifying rolls with Luck Potion */
        IntUnaryOperator modifierOperator = roll -> roll + d20WithLuck.getModifier();

        /* Simulate multiple games: Initialize array of rolls */
        int numGames = 5;
        int[] rolls = new int[numGames];
        Arrays.setAll(rolls, i -> modifierOperator.applyAsInt(rollSupplier.get())); // Generate and modify rolls
        System.out.println("Simulated rolls with Luck Potion +" + d20WithLuck.getModifier() + ": " + Arrays.toString(rolls));

        /* Filter wins with Predicate lambda */
        Predicate<Integer> winCondition = roll -> roll > 3;
        long wins = 0L;
        for (int roll : rolls) {
            if (winCondition.test(roll)) {
                wins++;
            }
        }
        System.out.println("Number of wins (roll > 3): " + wins);

        /* Simulate Android game loop with timer */
        Random random = new Random();
        Timer timer = new Timer(2000, event -> {
            int newRoll = modifierOperator.applyAsInt(rollSupplier.get());
            boolean isWin = winCondition.test(newRoll);
            System.out.println("Periodic roll: " + newRoll + " (Luck Potion +" + d20WithLuck.getModifier() + ") - " +
                    (isWin ? "Win!" : "No win"));
        });
        timer.start();

        /* Stop with JOptionPane */
        int option = JOptionPane.showConfirmDialog(null, "Quit game?", "Cosmic Casino", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            timer.stop();
            System.out.println("Game quit! Luck Potion expires!");
        } else {
            System.out.println("Keep rolling in the Cosmic Casino!");
            // Note: Timer continues in a real app
        }
    }
}