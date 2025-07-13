package TaskManagement;

public final class UrgentTask implements Prioritizable {
    private String name;

    public UrgentTask(String name) {
        this.name = name;
    }

    @Override
    public int getPriority() {
        return MAX_PRIORITY;
    }

    @Override
    public int getMaxPriority() {
        return MAX_PRIORITY; // বা return 10;
    }

    @Override
    public String toString() {
        return "[Urgent] " + name + " (Priority: " + MAX_PRIORITY + ")";
    }
}
