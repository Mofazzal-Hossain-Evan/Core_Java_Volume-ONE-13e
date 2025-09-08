/* Package declaration to match directory structure */
package Event_Scheduler_System; // Defines the package for organization, matching the directory structure

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) discusses how classes like Event can be sorted using custom Comparators, enabling flexible ordering based on different fields without implementing Comparable (Horstmann, p. 258). */

/* Class representing an event with name, duration, and priority */
public class Event { // Declares the Event class to model an event with attributes
    private String name; // Private field to store the event's name
    private int duration; // Private field to store the event's duration in minutes
    private int priority; // Private field to store the event's priority (higher number = higher priority)

    /* Constructor */
    public Event(String name, int duration, int priority) { // Constructor to initialize an Event object
        this.name = name; // Assigns the provided name to the name field
        this.duration = duration; // Assigns the provided duration to the duration field
        this.priority = priority; // Assigns the provided priority to the priority field
    }

    /* Getters */
    public String getName() { // Getter method to access the name field
        return name; // Returns the name of the event
    }

    public int getDuration() { // Getter method to access the duration field
        return duration; // Returns the duration of the event
    }

    public int getPriority() { // Getter method to access the priority field
        return priority; // Returns the priority of the event
    }

    @Override
    public String toString() { // Overrides toString() to provide a string representation of the Event
        return name + " (Duration: " + duration + ", Priority: " + priority + ")"; // Returns formatted string with name, duration, and priority
    }
}