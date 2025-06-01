package HistoricalBattlesSimulator;

public class Battle {
    String name;
    String location;
    int year;
    boolean wasDecisive;

    // No-argument constructor (sets default values)


    public Battle() {
        this.name = "Unknown Battle";
        this.location = "unknown location";
        this.year = 0;
        this.wasDecisive = false;
    }

    // Parameterized constructor

    public Battle(String name, String location, int year, boolean wasDecisive) {
        this.name = name;
        this.location = location;
        this.year = year;
        this.wasDecisive = wasDecisive;
    }

    void displayInfo() {
        System.out.println("Battle Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);


        // If the year is 0, display "Unknown", otherwise print the actual year
        if (year == 0) {
            System.out.println("year : Unknown");
        } else {
            System.out.println("Year: " + year);
        }

        // Display whether the battle was decisive or not
        if (wasDecisive) {
            System.out.println("Was Decisive? Yes");
        } else {
            System.out.println("Was Decisive? No");
        }
        System.out.println("-------------------------");
    }

}
