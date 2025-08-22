/* Package declaration to match directory structure */
package Notification_Handler_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) states that if a class implements interfaces with abstract methods and does not provide implementations, it must be declared abstract (Horstmann, p. 261). */

/* Abstract MultiChannelNotifier class implementing both abstract interfaces, no implementation */
public abstract class AbstractMultiChannelNotifier implements AbstractChannel, AbstractSMSChannel {
    // No implementation for getSenderInfo(); class is abstract
}