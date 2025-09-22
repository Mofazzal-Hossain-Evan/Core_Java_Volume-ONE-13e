package taskmanager;

import java.util.Date;
import java.util.Calendar;

/**
 * Task Manager with Task Duplication
 * Inspired by Android To-Do apps
 */
public class TaskManagerApp {
    public static void main(String[] args) {
        // Original task তৈরি
        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.SEPTEMBER, 25); // 25 Sept 2025
        Task original = new Task("Debug the Matrix", 1, cal.getTime());

        // clone তৈরি
        Task clone = original.clone();

        // clone modify করি
        clone.setPriority(5);
        cal.set(2025, Calendar.OCTOBER, 5); // 5 Oct 2025
        clone.setDueDate(cal.getTime());

        // দুইটা task প্রিন্ট করি
        System.out.println("Original Task: " + original);
        System.out.println("Cloned Task:   " + clone);

        System.out.println("\n--- Task List Simulation ---");
        Task[] taskList = new Task[2];
        taskList[0] = original;
        taskList[1] = clone;

        for (Task t : taskList) {
            System.out.println(t);
        }
    }
}
