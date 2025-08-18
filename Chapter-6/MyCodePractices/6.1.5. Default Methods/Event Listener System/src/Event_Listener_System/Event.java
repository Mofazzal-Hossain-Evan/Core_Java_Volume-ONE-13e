package Event_Listener_System;

public class Event {
    private String name;
    private String source;

    public Event(String name, String source) {
        this.name = name;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
