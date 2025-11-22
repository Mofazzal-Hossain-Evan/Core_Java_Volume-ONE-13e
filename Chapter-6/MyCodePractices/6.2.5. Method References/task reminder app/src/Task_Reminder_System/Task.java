package Task_Reminder_System;
import java.time.LocalDateTime;

public class Task {
    private String description;
    private LocalDateTime dueTime;

    public Task(String description, LocalDateTime dueTime) {
        this.description = description;
        this.dueTime = dueTime;
    }

    public boolean isDue(){
        return LocalDateTime.now().isAfter(dueTime);
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", dueTime=" + dueTime +
                '}';
    }
}
