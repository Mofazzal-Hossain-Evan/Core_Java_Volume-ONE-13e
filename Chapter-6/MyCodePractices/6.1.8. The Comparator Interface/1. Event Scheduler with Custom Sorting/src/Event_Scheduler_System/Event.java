package socialmediafriendsorter;

public class Event {
    private String name;
    private int duration;
    private int priority;

    public Event(String name, int duration, int priority) {
        this.name = name;
        this.duration = duration;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getPriority() {
        return priority;
    }

    public String toString(){
        return name + " (Duration: " + duration + ", Priority: " + priority + ")";
    }
}
