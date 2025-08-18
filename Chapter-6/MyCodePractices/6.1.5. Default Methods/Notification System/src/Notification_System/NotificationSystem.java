/* Package declaration to match directory structure */
package Notification_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that default methods support interface evolution, like adding logSent(), without modifying existing implementations such as SMSNotifier, preserving compatibility (Horstmann, p. 262). *Effective Java* (Item 20) emphasizes defaults for fallback and optional operations (Bloch, p. 109). */

/* Class containing main method for testing Notifier implementations */
public class NotificationSystem {
    public static void main(String[] args) {
        /* Create EmailNotifier instance */
        Notifier emailNotifier = new EmailNotifier();
        System.out.println("Testing EmailNotifier (overrides retry, uses defaults for others):");
        System.out.println("Is available? " + emailNotifier.isAvailable()); // Uses default isAvailable()
        emailNotifier.send("Hello via Email" +"/ from email notifier");
        emailNotifier.retry("Hello via Email"); // Uses overridden retry()
        emailNotifier.logSent("Hello via Email"); // Uses default logSent()
        System.out.println();

        /* Create SMSNotifier instance */
        Notifier smsNotifier = new SMSNotifier();
        System.out.println("Testing SMSNotifier (uses all default methods except send):");
        System.out.println("Is available? " + smsNotifier.isAvailable()); // Uses default isAvailable()
        smsNotifier.send("Hello via SMS" + "/ from SMS notifier");
        smsNotifier.retry("Hello via SMS"); // Uses default retry()
        smsNotifier.logSent("Hello via SMS"); // Uses default logSent()
        System.out.println();

        /* Demonstrate interface evolution: logSent() added as default, compatible with both implementations */
        System.out.println("Demonstrating interface evolution with logSent():");
        emailNotifier.logSent("Evolution test for Email");
        smsNotifier.logSent("Evolution test for SMS");
    }
}