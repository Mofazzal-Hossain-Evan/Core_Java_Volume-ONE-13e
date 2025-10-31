/* Package declaration */
package Task_Priority_Assigner;

/* থিয়রি: *Core Java* (p. 274) বলে, POJO ক্লাস ডেটা হোল্ড করে, যা ল্যামডা দিয়ে প্রসেস করা যায়। */

public class Task {
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    // Getters and Setters
    public String getDescription() { return description; }
    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    @Override
    public String toString() {
        return description + " | Priority: " + priority;
    }
}