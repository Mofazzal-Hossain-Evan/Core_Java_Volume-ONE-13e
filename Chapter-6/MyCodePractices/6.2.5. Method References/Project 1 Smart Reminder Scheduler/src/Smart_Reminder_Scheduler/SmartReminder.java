package Smart_Reminder_Scheduler;

import javax.swing.*;
import java.time.Instant;

public class SmartReminder {
    public static void main(String[] args) {
        // Object method reference: System.out::println
        Timer timer = new Timer(2000, System.out::println);
        timer.start();

        JOptionPane.showMessageDialog(null, "Reminder running... Close to stop.");
        System.exit(0);
    }
}
