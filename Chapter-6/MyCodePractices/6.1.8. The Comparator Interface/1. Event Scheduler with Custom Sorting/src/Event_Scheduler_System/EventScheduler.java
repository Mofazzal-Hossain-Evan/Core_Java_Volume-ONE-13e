/* Package declaration to match directory structure */
package Event_Scheduler_System; // Defines the package for organization, matching the directory structure

import java.util.Arrays; // Imports Arrays for sorting arrays
import java.util.Random; // Imports Random for generating random events

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes using Arrays.sort with custom Comparators in programs like EventScheduler for flexible sorting, mimicking task scheduling scenarios (Horstmann, p. 258). *Effective Java* (Item 14) recommends Comparators for multiple sort criteria in applications (Bloch, p. 70). */

/* Main class to schedule and sort events */
public class EventScheduler { // Declares the main EventScheduler class
    /* Method to generate random events */
    private static Event[] generateRandomEvents(int count) { // Defines method to generate an array of random events
        Random random = new Random(); // Creates a Random instance for generating random values
        Event[] events = new Event[count]; // Initializes an array to hold the specified number of events
        for (int i = 0; i < count; i++) { // Loops to create the specified number of events
            String name = "Event " + (i + 1); // Generates a unique event name (e.g., Event 1, Event 2)
            int duration = random.nextInt(60) + 1; // Generates random duration between 1 and 60 minutes
            int priority = random.nextInt(10) + 1; // Generates random priority between 1 and 10
            events[i] = new Event(name, duration, priority); // Creates a new Event and stores it in the array
        }
        return events; // Returns the array of generated events
    }

    public static void main(String[] args) { // Main method to run the event scheduler
        /* Generate random events */
        Event[] events = generateRandomEvents(5); // Generates 5 random events
        System.out.println("Original events:"); // Prints header for original event list
        for (Event event : events) { // Iterates through the events array
            System.out.println(event); // Prints each event using its toString() method
        }
        System.out.println(); // Prints a blank line for readability

        /* Sort by duration (shortest to longest) */
        Arrays.sort(events, new DurationComparator()); // Sorts the events array using DurationComparator
        System.out.println("Scheduled by duration (shortest to longest):"); // Prints header for duration-based schedule
        for (Event event : events) { // Iterates through the sorted events array
            System.out.println("Scheduling: " + event); // Prints each event with a scheduling prefix
        }
        System.out.println(); // Prints a blank line for readability

        /* Sort by priority (high to low) */
        Arrays.sort(events, new PriorityComparator()); // Sorts the events array using PriorityComparator
        System.out.println("Scheduled by priority (high to low):"); // Prints header for priority-based schedule
        for (Event event : events) { // Iterates through the sorted events array
            System.out.println("Scheduling: " + event); // Prints each event with a scheduling prefix
        }
    }
}