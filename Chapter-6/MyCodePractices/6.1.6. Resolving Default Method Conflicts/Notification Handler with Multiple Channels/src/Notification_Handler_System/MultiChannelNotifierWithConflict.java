/* Package declaration to match directory structure */
package Notification_Handler_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that when implementing multiple interfaces with conflicting default methods, the class must override the method to resolve the conflict, potentially using super to invoke a specific default (Horstmann, p. 261). */

/* MultiChannelNotifier class implementing both interfaces, resolving conflict by overriding */
public class MultiChannelNotifierWithConflict implements EmailChannel, SMSChannel {
    @Override
    public String getSenderInfo() {
        return EmailChannel.super.getSenderInfo() + " / " + SMSChannel.super.getSenderInfo();
        // Resolve by combining both defaults
    }
}