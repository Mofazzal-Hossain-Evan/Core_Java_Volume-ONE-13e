/* Package declaration to match directory structure */
package Notification_Handler_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that the "class wins" rule means superclass methods override interface defaults, preventing conflicts even if interfaces have conflicting defaults (Horstmann, p. 261). */

/* MultiChannelNotifier class extending BaseNotifier and implementing both interfaces, no override needed */
public class MultiChannelNotifierWithSuperclass extends BaseNotifier implements EmailChannel, SMSChannel {
    // No override; uses superclass getSenderInfo()
    public String getSenderInfo(){
        return EmailChannel.super.getSenderInfo() + "/" + SMSChannel.super.getSenderInfo();
    }

}