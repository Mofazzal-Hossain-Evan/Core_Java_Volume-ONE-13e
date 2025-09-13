/* Package declaration to match directory structure */
package Superhero_Team_Builder;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that implementing Cloneable with deep copying for mutable fields like abilities ensures clones are independent, mimicking entity management in Spring Boot (Horstmann, p. 271). *Effective Java* (Item 13) recommends overriding clone() judiciously and handling deep copies for mutable state (Bloch, p. 56). */

/* Superhero class implementing Cloneable */
public class Superhero implements Cloneable {
    private String name;
    private double powerLevel;
    private java.util.List<String> abilities;

    public Superhero(String name, double powerLevel, java.util.List<String> abilities) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.abilities = abilities;
    }

    @Override
    public Superhero clone() throws CloneNotSupportedException {
        Superhero clone = (Superhero) super.clone();
        clone.abilities = new java.util.ArrayList<>(this.abilities); // Deep copy of abilities
        return clone;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }

    public java.util.List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(java.util.List<String> abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        return "Superhero{name='" + name + "', powerLevel=" + powerLevel + ", abilities=" + abilities + '}';
    }
}