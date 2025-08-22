/* Package declaration to match directory structure */
package Notification_Handler_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) confirms that implementing an interface with a default and another with an abstract declaration for the same method uses the default without error or need for override (Horstmann, p. 261). */

/* MultiChannelNotifier class implementing EmailChannel (default) and AbstractChannel (abstract), no override needed */
public class MultiChannelNotifierWithAbstract implements EmailChannel, AbstractChannel {
    @Override
    public String getSenderInfo() {
        return EmailChannel.super.getSenderInfo();
    }
    // No override; uses EmailChannel's default
}