/* Package declaration to match directory structure */
package Notification_Handler_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) confirms that if both interfaces declare the method abstract, the implementing class must provide an implementation or be abstract itself (Horstmann, p. 261). */

/* Interface with abstract getSenderInfo */
public interface AbstractSMSChannel {
    String getSenderInfo(); // Abstract, no default
}