/* Package declaration to match directory structure */
package Task_Manager_With_Task_Duplication;

import java.util.Date;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) covers Cloneable with deep copies for mutable objects like Date to ensure clones remain independent, resembling task duplication in Android apps (Horstmann, p. 271). *Effective Java* (Item 13) stresses cloning dates to avoid shared references (Bloch, p. 56). */

/* Task class implementing Cloneable */
public class Task implements Cloneable {
    private String title;
    private int priority;
    private Date dueDate;

    public Task(String title, int priority, Date dueDate) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    @Override
    public Task clone() throws CloneNotSupportedException {
        Task clone = (Task) super.clone();
        clone.dueDate = (Date) this.dueDate.clone(); // Deep copy of dueDate
        return clone;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{title='" + title + "', priority=" + priority + ", dueDate=" + dueDate + '}';
    }
}