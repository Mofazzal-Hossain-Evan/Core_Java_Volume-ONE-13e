/* Package declaration to match directory structure */
package Notification_Handler_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that concrete methods in superclasses take precedence over default methods in interfaces, following the "class wins" rule (Horstmann, p. 261). */

/* Superclass BaseNotifier with concrete getSenderInfo */
public class BaseNotifier {
    public String getSenderInfo() {
        return "Base Sender: notifier@system";
    }
}