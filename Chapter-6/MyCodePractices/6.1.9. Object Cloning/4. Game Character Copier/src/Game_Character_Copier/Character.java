/* Package declaration to match directory structure */
package Game_Character_Copier;

import java.util.List;
import java.util.ArrayList;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains deep cloning for complex objects like Character with mutable lists, using Cloneable to copy inventory and clone each Item for independence in gaming contexts (Horstmann, p. 271). *Effective Java* (Item 13) advises deep copies for collections containing mutable objects (Bloch, p. 56). */

/* Character class implementing Cloneable */
public class Character implements Cloneable {
    private String name;
    private double health;
    private List<Item> inventory;

    public Character(String name, double health, List<Item> inventory) {
        this.name = name;
        this.health = health;
        this.inventory = inventory;
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        Character clone = (Character) super.clone();
        clone.inventory = new ArrayList<>(); // Deep copy the list
        for (Item item : this.inventory) {
            clone.inventory.add(item.clone()); // Clone each mutable Item
        }
        return clone;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Character{name='" + name + "', health=" + health + ", inventory=" + inventory + '}';
    }
}