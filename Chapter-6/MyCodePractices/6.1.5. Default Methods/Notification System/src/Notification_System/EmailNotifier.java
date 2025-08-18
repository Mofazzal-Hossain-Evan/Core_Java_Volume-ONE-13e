/* Package declaration to match directory structure */
package Notification_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) illustrates that classes like EmailNotifier can override default methods (e.g., retry()) to provide custom behavior while using others unchanged (Horstmann, p. 262). */

/* Email notifier implementation */
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }

    @Override
    public void retry(String message) {
        System.out.println("Specific retry for email: Attempting to resend " + message);
        send(message); // Custom retry logic
    }

    // Uses default isAvailable()

    // Uses default logSent()

    public boolean isAvailable(){
        return true;
    }

    public void logSent(String message){
        System.out.println(message);
    }
}
