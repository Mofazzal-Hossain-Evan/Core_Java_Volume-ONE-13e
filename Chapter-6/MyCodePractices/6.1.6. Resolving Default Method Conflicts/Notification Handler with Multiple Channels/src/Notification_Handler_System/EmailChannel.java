/* Package declaration to match directory structure */
package Notification_Handler_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes how interfaces can provide default methods, but conflicts arise when multiple interfaces define the same default method, requiring resolution in the implementing class (Horstmann, p. 261). */

/* Interface EmailChannel with default getSenderInfo */
public interface EmailChannel {
    default String getSenderInfo() {
        return "Email Sender: admin@example.com";
    }
}