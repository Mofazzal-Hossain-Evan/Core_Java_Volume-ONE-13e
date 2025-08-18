/* Package declaration to match directory structure */
        package Notification_System;

/* Theory: *Effective Java* (Item 20) recommends relying on default methods in implementations like SMSNotifier for fallback behavior, such as the generic retry(), without needing to override (Bloch, p. 109). */

/* SMS notifier implementation */
public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }

    public void retry(String message){
        System.out.println(message);
    }
    public boolean isAvailable(){
        return true;
    }
    public void logSent(String message){
        System.out.println(message);
    }
}
