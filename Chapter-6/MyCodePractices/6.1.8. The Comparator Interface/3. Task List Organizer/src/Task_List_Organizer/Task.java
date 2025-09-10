package Task_List_Organizer;

public class Task {
    private String title;
    private String dueDate;
    private String category;

    public Task(String title, String dueDate, String category) {
        this.title = title;
        this.dueDate = dueDate;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
