package taskmanager;

import java.util.Date;

/**
 * Task ক্লাস (Android To-Do style)
 * Cloneable implement করে deep copy তৈরি করবে।
 */
public class Task implements Cloneable {
    private String title;
    private int priority;
    private Date dueDate; // mutable object

    public Task(String title, int priority, Date dueDate) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    // clone() override
    @Override
    public Task clone() {
        try {
            Task copy = (Task) super.clone();
            // Deep copy of mutable Date object
            copy.dueDate = (Date) this.dueDate.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported!");
        }
    }

    // setters
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    // toString override
    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                ", dueDate=" + dueDate +
                '}';
    }
}
