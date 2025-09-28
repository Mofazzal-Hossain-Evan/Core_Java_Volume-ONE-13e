package Event_Reminder;

import java.util.Timer;
import java.util.TimerTask;

public class EventReminder {
    public static void main(String[] args) {
        // Timer অবজেক্ট বানানো
        Timer timer = new Timer();

        // TimerTask: কী হবে যখন সময় শেষ হবে
        TimerTask reminderTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("⏰ Reminder: Time for your meeting!");
                // কাজ শেষে timer বন্ধ করা (না করলে timer background এ চলতেই থাকবে)
                timer.cancel();
            }
        };

        System.out.println("Reminder set... will notify in 5 seconds.");

        // ৫ সেকেন্ড পর কাজ করবে
        timer.schedule(reminderTask, 5000);
    }
}
