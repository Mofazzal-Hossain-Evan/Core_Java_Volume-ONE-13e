package Procrastination_Level_Tracker;

public enum ProcrastinationLevelTracker {
    LOW("Actually working"),
    MEDIUM("Browsing memes"),
    HIGH("Netflix and snacks"),
    CRITICAL("Cleaning room to avoid work");

    private final String description;

    ProcrastinationLevelTracker(String description) {
        this.description = description;

    }

    public String getDescription(){
        return description;
    }
}
