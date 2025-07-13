package TaskManagement;

import static java.lang.Thread.MAX_PRIORITY;

public final class WorkTask implements  Prioritizable, Archivable {
    private String title;
    private int priority;
    private boolean archived;

    public WorkTask(String title, int priority) {
        this.title = title;
        this.priority = Math.min(priority, MAX_PRIORITY);
        this.archived = false;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isArchived() {
        return archived;

    }


    @Override
    public void archive() {
        archived = true;
        System.out.println("Archived work task: " + title); // কনফার্মেশন মেসেজ
    }

    @Override
    public String toString() {
        return "WorkTask{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                ", archived=" + archived +
                '}';
    }

    @Override
    public int getMaxPriority() {
        return 0;
    }
}
