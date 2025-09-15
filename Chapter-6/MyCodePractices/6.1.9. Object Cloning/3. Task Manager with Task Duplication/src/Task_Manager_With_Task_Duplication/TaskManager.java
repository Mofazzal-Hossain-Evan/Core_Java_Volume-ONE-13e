/* Package declaration to match directory structure */
package Task_Manager_With_Task_Duplication;

import java.util.Date;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) demonstrates deep cloning for dates to prevent mutations from affecting originals, useful for task reassignment in Android-like task managers (Horstmann, p. 271). */

/* Class containing main method for testing Task cloning */
public class TaskManager {
    public static void main(String[] args) throws CloneNotSupportedException {
        /* Create original task */
        Date dueDate = new Date(); // Current date for demo
        Task original = new Task("Debug the Matrix", 5, dueDate);

        /* Clone the task */
        Task clone = original.clone();

        /* Change the clone */
        clone.setPriority(10);
        clone.getDueDate().setTime(clone.getDueDate().getTime() + 86400000); // Add one day

        /* Print both to confirm independence */
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
        System.out.println();

        /* Simulate Android app's task list with an array */
        Task[] taskList = new Task[2];
        taskList[0] = original;
        taskList[1] = new Task("Feed the Code Gremlins", 3, new Date(dueDate.getTime() + 172800000)); // Two days later

        /* Clone tasks for reassignment */
        Task[] reassignedTasks = new Task[taskList.length];
        for (int i = 0; i < taskList.length; i++) {
            reassignedTasks[i] = taskList[i].clone();
        }

        /* Modify clones for reassignment */
        reassignedTasks[0].setPriority(8);
        reassignedTasks[0].getDueDate().setTime(reassignedTasks[0].getDueDate().getTime() + 86400000);
        reassignedTasks[1].setTitle("Tame the Code Gremlins");

        /* Print original task list and reassigned tasks */
        System.out.println("Original Task List:");
        for (Task task : taskList) {
            System.out.println(task);
        }
        System.out.println();

        System.out.println("Reassigned Tasks (Clones):");
        for (Task task : reassignedTasks) {
            System.out.println(task);
        }
    }
}