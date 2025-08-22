/* Package declaration to match directory structure */
package Notification_Handler_System;

/* Theory: *Effective Java* (Item 20) advises that if one interface provides a default and another declares the method abstract, no conflict occurs, and the default is used (Bloch, p. 109). */

/* Interface with abstract getSenderInfo to demonstrate no conflict */
public interface AbstractChannel {
    String getSenderInfo(); // Abstract, no default
}