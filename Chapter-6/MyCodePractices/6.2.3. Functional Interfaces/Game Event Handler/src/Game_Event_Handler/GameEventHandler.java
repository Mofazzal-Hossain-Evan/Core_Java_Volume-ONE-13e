/* Package declaration to match directory structure */
package Game_Event_Handler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights lambda expressions as concise implementations for functional interfaces like ActionListener, simplifying event handling in Android-inspired game loops (Horstmann, p. 274). *Effective Java* (Item 42) advocates lambdas for single-method interfaces to reduce boilerplate and enable deferred execution (Bloch, p. 200). */

/* Main class for game event handler with lambda-based timers */
public class GameEventHandler {
    private static List<GameEvent> eventQueue = new ArrayList<>();
    private static int score = 0;
    private static String[] eventTypes = {
            "Player scores!",
            "Pixel Monster Appears!",
            "Quantum Power-Up Collected!",
            "Code Glitch Defeated!"
    };

    public static void main(String[] args) {
        /* Initialize event queue with initial events */
        eventQueue.add(new GameEvent("Game Started!"));
        eventQueue.add(new GameEvent("Player Enters Pixel Realm"));

        /* First lambda-based ActionListener: Process new events every 2 seconds */
        Random random = new Random();
        Timer eventTimer = new Timer(2000, event -> {
            String eventType = eventTypes[random.nextInt(eventTypes.length)]; // Randomize event type
            GameEvent newEvent = new GameEvent(eventType);
            eventQueue.add(newEvent);
            if (eventType.equals("Player scores!")) {
                score += 10; // Increment score for scoring events
            }
            System.out.println("New event: " + newEvent);
            displayEventQueue(); // Simulate Android game loop refresh
        });

        /* Second lambda-based ActionListener: Handle game over every 6 seconds */
        Timer gameOverTimer = new Timer(6000, event -> {
            System.out.println("Game Over! Final Score: " + score);
            displayEventQueue();
        });


        /* Start timers */
        eventTimer.start();
        gameOverTimer.setRepeats(false); // Game over only once
        gameOverTimer.start();

        /* Stop with JOptionPane */
        int option = JOptionPane.showConfirmDialog(
                null,
                "New game?",
                "Game Event Handler",
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.YES_OPTION) {
            eventTimer.stop();
            gameOverTimer.stop();
            System.out.println("Starting new game! Resetting pixel realm...");
        } else {
            eventTimer.stop();
            gameOverTimer.stop();
            System.out.println("Game ended. Pixel monsters return to the void!");
        }
    }

    /* Helper method to display the event queue with timestamps */
    private static void displayEventQueue() {
        System.out.println("=== Event Queue (Refreshed at " + LocalDateTime.now().toLocalTime() + ") ===");
        for (GameEvent event : eventQueue) {
            System.out.println(event);
        }
        System.out.println("Current Score: " + score);
        System.out.println("=====================================\n");
    }
}