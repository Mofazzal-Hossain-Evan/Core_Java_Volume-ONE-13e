package Task_Reminder_System;

import javax.swing.*;
import javax.swing.Timer;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Objects;

public class TaskReminderSystem {

    public static void main(String[] args) {

        // Task list
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Complete Java Assignment", LocalDateTime.now().minusSeconds(5)));
        tasks.add(new Task("Practice Method References", LocalDateTime.now().plusSeconds(10)));
        tasks.add(new Task("Reference the Unreferenced 🤣", LocalDateTime.now().minusSeconds(2)));
        tasks.add(null); // Intentionally added to show removeIf + Objects::isNull

        // 🧠 Beginner Problem: null removal
        // Brain often says: “removeIf কী করে??”
        // Think like this: removeIf = “যদি condition true হয়, আইটেমটাকে লিস্ট থেকে ফেলে দাও”
        tasks.removeIf(Objects::isNull);

        // 🧠 Beginner Problem: Sorting with method reference
        // Think: “আমি Task-এর description string তুলনা করতে চাই → String::compareTo”
        tasks.sort(Comparator.comparing(Task::getDescription));

        // Logger using method reference
        TaskLogger logger = System.out::println;

        // Timer acts like Spring Boot cron scheduler
        Timer reminderTimer = new Timer(3000, event -> {
            System.out.println("\n⏰ Checking tasks at: " + LocalDateTime.now());

            tasks.stream()
                    .filter(Task::isDue)            // method reference → natural filtering
                    .map(Task::getDescription)      // convert Task → description
                    .forEach(logger::log);          // print them cleanly
        });

        reminderTimer.start();

        JOptionPane.showMessageDialog(null,
                "Task Reminder Running...\nClose this window to stop.",
                "Task Reminder", JOptionPane.INFORMATION_MESSAGE);

        reminderTimer.stop();
    }
}
