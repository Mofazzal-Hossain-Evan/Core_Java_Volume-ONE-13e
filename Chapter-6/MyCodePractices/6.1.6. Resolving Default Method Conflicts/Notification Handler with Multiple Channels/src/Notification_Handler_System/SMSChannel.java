/* Package declaration to match directory structure */
package Notification_Handler_System;

/* Theory: *Effective Java* (Item 21) discusses the importance of designing interfaces carefully to avoid conflicts in default methods when multiple interfaces are implemented (Bloch, p. 112). */

/* Interface SMSChannel with default getSenderInfo */
public interface SMSChannel {
    default String getSenderInfo() {
        return "SMS Sender: +1234567890";
    }
}