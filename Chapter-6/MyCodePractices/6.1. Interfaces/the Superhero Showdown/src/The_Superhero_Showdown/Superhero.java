
package The_Superhero_Showdown;

// Superhero class implementing Comparable for natural ordering by power level
public class Superhero implements Comparable<Superhero> {
    // Instance variables for superhero attributes
    private String name;       // Stores the superhero's name
    private int powerLevel;   // Stores the superhero's power level (integer)
    private double speed;      // Stores the superhero's speed (double for precision)
    private String team;       // Stores the superhero's team affiliation

    // Constructor to initialize all fields
    public Superhero(String name, int powerLevel, double speed, String team) {
        this.name = name;  // Set the name
        // Validate powerLevel to ensure it's non-negative
        this.powerLevel = powerLevel >= 0 ? powerLevel : 0;
        // Validate speed to ensure it's non-negative
        this.speed = speed >= 0 ? speed : 0;
        this.team = team;  // Set the team
    }

    // Getter for name
    public String getName() {
        return name;  // Return the superhero's name
    }

    // Getter for powerLevel
    public int getPowerLevel() {
        return powerLevel;  // Return the superhero's power level
    }

    // Getter for speed
    public double getSpeed() {
        return speed;  // Return the superhero's speed
    }

    // Getter for team
    public String getTeam() {
        return team;  // Return the superhero's team
    }

    // Implement compareTo for natural ordering (by powerLevel)
    @Override
    public int compareTo(Superhero other) {
        // Compare power levels using Integer.compare for correct ordering
        int powerComparison = Integer.compare(this.powerLevel, other.powerLevel);
        // If power levels are equal, use name as tie-breaker
        return powerComparison != 0 ? powerComparison : this.name.compareTo(other.name);
    }

    // Override toString for readable output
    @Override
    public String toString() {
        // Format output as "Name: X, Power: Y, Speed: Z, Team: W"
        return String.format("Name: %s, Power: %d, Speed: %.1f, Team: %s",
                name, powerLevel, speed, team);
    }
}
