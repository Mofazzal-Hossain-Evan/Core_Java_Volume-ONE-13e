/* Package declaration to match directory structure */
package Game_Character_Copier;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) discusses implementing Cloneable for mutable objects like Item to enable deep cloning, ensuring independence in game scenarios (Horstmann, p. 271). *Effective Java* (Item 13) recommends cloning mutable fields to prevent shared state (Bloch, p. 56). */

/* Simple Item class implementing Cloneable */
public class Item implements Cloneable {
    private String name;
    private int durability;

    public Item(String name, int durability) {
        this.name = name;
        this.durability = durability;
    }

    @Override
    public Item clone() throws CloneNotSupportedException {
        return (Item) super.clone(); // Shallow copy sufficient if no mutable fields beyond primitives
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', durability=" + durability + '}';
    }
}