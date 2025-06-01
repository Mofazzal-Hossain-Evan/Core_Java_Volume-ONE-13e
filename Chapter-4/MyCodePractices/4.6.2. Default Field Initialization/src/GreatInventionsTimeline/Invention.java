package GreatInventionsTimeline;

import java.time.LocalDate;

public class Invention {
    String name;
    String inventor;
    LocalDate discoveryDate;
    boolean patented;

    void displayInfo() {
        System.out.println("Invention: " + name);
        System.out.println("Inventor: " + inventor);
        System.out.println("Discovery Date: " + discoveryDate);
        System.out.println("Patented: " + patented);
    }
}

