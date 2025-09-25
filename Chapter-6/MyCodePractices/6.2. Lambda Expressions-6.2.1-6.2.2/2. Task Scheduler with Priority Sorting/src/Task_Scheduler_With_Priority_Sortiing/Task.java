/* Package declaration to match directory structure */
package Task_Scheduler_With_Priority_Sortiing;

import java.util.Date;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) discusses using lambda expressions for Comparator implementations on classes like Task, enabling flexible sorting in scheduling applications (Horstmann, p. 274). *Effective Java* (Item 42) recommends lambdas for functional interfaces like Comparator to improve code readability (Bloch, p. 200). */

/* Task class with basic fields */
public class Task {
    private String name;
    private int priority;
    private Date dueDate;

    public Task(String name, int priority, Date dueDate) {
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", dueDate=" + dueDate + "}";
    }
}