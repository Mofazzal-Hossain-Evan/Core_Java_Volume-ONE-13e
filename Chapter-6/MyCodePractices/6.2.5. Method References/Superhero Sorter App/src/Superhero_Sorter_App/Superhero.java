/* Package declaration */
package Superhero_Sorter_App;

/* থিয়রি: *Core Java* (p. 274) বলে, ক্লাসে মেথড যেমন getPowerLevel() রেফারেন্স করে কম্প্যারেটর তৈরি করা যায়। */

public class Superhero {
    private String name;
    private int powerLevel;

    public Superhero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    // Getters
    public String getName() { return name; }
    public int getPowerLevel() { return powerLevel; }

    @Override
    public String toString() {
        return name + " (Power: " + powerLevel + ")";
    }
}