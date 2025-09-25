/* Package declaration to match directory structure */
package Task_Scheduler_With_Priority_Sortiing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights lambda expressions for creating Comparators and ActionListeners, simplifying sorting and event handling in Spring Boot-inspired task scheduling (Horstmann, p. 274). *Effective Java* (Item 42) advocates lambdas for functional interfaces to enhance code conciseness in event-driven applications (Bloch, p. 200). */

/* Main class for task scheduler with priority sorting */
public class TaskScheduler {
    public static void main(String[] args) {
        /* Create tasks with quirky names */
        Task[] tasks = {
                new Task("Debug the Time Vortex", 8, new Date(System.currentTimeMillis() + 86400000)), // Tomorrow
                new Task("Patch the Black Hole", 5, new Date(System.currentTimeMillis() + 172800000)), // Day after tomorrow
                new Task("Reboot the Universe", 10, new Date(System.currentTimeMillis() + 43200000)), // Half day later
                new Task("Feed the Code Gremlins", 3, new Date(System.currentTimeMillis() + 259200000)) // Three days later
        };

        /* Sort by priority (descending) using lambda Comparator */
        Arrays.sort(tasks, (t1, t2) -> t2.getPriority() - t1.getPriority());
        System.out.println("Sorted by priority (descending):");
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println();

        /* Sort by due date using lambda Comparator */
        Arrays.sort(tasks, (t1, t2) -> t1.getDueDate().compareTo(t2.getDueDate()));
        System.out.println("Sorted by due date:");
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println();

        /* Simulate reminders with Timer and lambda ActionListener */
        Timer timer = new Timer(2000, event -> System.out.println("Task reminder at " + new Date()));
        timer.start();

        /* Display JOptionPane to stop reminders */
        int option = JOptionPane.showConfirmDialog(
                null,
                "Cancel all tasks?",
                "Task Scheduler",
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.YES_OPTION) {
            timer.stop();
            System.out.println("All tasks cancelled. Time vortex stabilized!");
        } else {
            System.out.println("Tasks continue to run. Keep debugging the universe!");
            // Note: Main thread ends here, but timer would continue in a real app
        }
    }
}