/* Package declaration to match directory structure */
package Notification_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes how default methods in interfaces like Notifier offer fallback implementations and facilitate interface evolution without affecting existing classes (Horstmann, p. 262). *Effective Java* (Item 20) advises using default methods for optional behaviors and backward compatibility (Bloch, p. 109). */

/* Interface for notifiers with default methods */
public interface Notifier {
    /* Abstract method to send a message */
    void send(String message);

    /* Default method for retry that logs a generic retry attempt */
    default void retry(String message) {
        System.out.println("Generic retry attempt for message: " + message);
        send(message); // Retry by sending again
    }

    /* Default method to check if available */
    default boolean isAvailable() {
        return true;
    }

    /* New default method for logging sent notifications to simulate interface evolution */
    default void logSent(String message) {
        System.out.println("Logged: Notification sent - " + message);
    }
}