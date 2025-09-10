/* Package declaration to match directory structure */
package Task_List_Organizer; // Defines the package for organization, matching the directory structure

import java.util.Arrays; // Imports Arrays for sorting arrays

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes using Arrays.sort with custom Comparators in apps like TaskListOrganizer for dynamic task sorting, simulating Android UI refresh with printed "screen updates" (Horstmann, p. 258). *Effective Java* (Item 14) recommends Comparators for multiple criteria in task management (Bloch, p. 70). */

/* Main class for task list organizing and sorting */
public class TaskListOrganizer { // Declares the main TaskListOrganizer class
    public static void main(String[] args) { // Main method to run the task list organizer
        /* Create tasks with fun titles */
        Task[] tasks = new Task[4]; // Initializes an array to hold 4 tasks
        tasks[0] = new Task("Defeat the Bug Boss", "2025-09-10", "Work"); // Creates a fun Task with title "Defeat the Bug Boss", due "2025-09-10", category "Work"
        tasks[1] = new Task("Conquer Laundry Mountain", "2025-09-12", "Personal"); // Creates a fun Task with title "Conquer Laundry Mountain", due "2025-09-12", category "Personal"
        tasks[2] = new Task("Code the Ultimate App", "2025-09-11", "Work"); // Creates a Task with title "Code the Ultimate App", due "2025-09-11", category "Work"
        tasks[3] = new Task("Plan World Domination", "2025-09-13", "Personal"); // Creates a fun Task with title "Plan World Domination", due "2025-09-13", category "Personal"

        System.out.println("Original To-Do List:"); // Prints header for original task list
        for (Task task : tasks) { // Iterates through the tasks array
            System.out.println(task); // Prints each task using its toString() method
        }
        System.out.println(); // Prints a blank line for readability

        /* Sort by due date (earliest first) */
        Arrays.sort(tasks, new DueDateComparator()); // Sorts the tasks array using DueDateComparator
        System.out.println("Screen Update: To-Do List Sorted by Due Date"); // Prints header simulating Android UI refresh for due date sort
        for (Task task : tasks) { // Iterates through the sorted tasks array
            System.out.println(task); // Prints each task
        }
        System.out.println(); // Prints a blank line for readability

        /* Sort by category (Work > Personal) */
        Arrays.sort(tasks, new CategoryComparator()); // Sorts the tasks array using CategoryComparator
        System.out.println("Screen Update: To-Do List Sorted by Category"); // Prints header simulating Android UI refresh for category sort
        for (Task task : tasks) { // Iterates through the sorted tasks array
            System.out.println(task); // Prints each task
        }
    }
}