/* Package declaration to match directory structure */
package Game_Character_Copier;

import java.util.ArrayList;
import java.util.List;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) demonstrates deep cloning to ensure modifications to clones don't affect originals, providing an easy way to manage game states in Android-inspired development (Horstmann, p. 271). */

/* Class containing main method for testing Character cloning */
public class GameCharacterCopier {
    public static void main(String[] args) throws CloneNotSupportedException {
        /* Create original character */
        List<Item> inventory = new ArrayList<>();
        inventory.add(new Item("Sword of Syntax", 100));
        inventory.add(new Item("Shield of Debugging", 80));
        Character original = new Character("Pixel Paladin", 150.0, inventory);

        /* Clone the character */
        Character clone = original.clone();

        /* Modify the clone */
        clone.setHealth(120.0);
        clone.getInventory().get(0).setDurability(90); // Modify item's durability
        clone.getInventory().add(new Item("Potion of Pixels", 50));

        /* Print both to verify independence */
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
        System.out.println();

        /* Emulate game state management with characters for different levels */
        Character[] level1Characters = new Character[2];
        level1Characters[0] = original;
        level1Characters[1] = new Character("Vector Viking", 130.0, new ArrayList<>() {{
            add(new Item("Axe of Algorithms", 95));
        }});

        /* Clone for level 2 */
        Character[] level2Characters = new Character[level1Characters.length];
        for (int i = 0; i < level1Characters.length; i++) {
            level2Characters[i] = level1Characters[i].clone();
        }

        /* Update clones independently for level 2 */
        level2Characters[0].setHealth(140.0);
        level2Characters[0].getInventory().add(new Item("Helm of Hacks", 70));
        level2Characters[1].getInventory().get(0).setDurability(85);

        /* Print level 1 and level 2 characters */
        System.out.println("Level 1 Characters:");
        for (Character chara : level1Characters) {
            System.out.println(chara);
        }
        System.out.println();

        System.out.println("Level 2 Characters (Clones):");
        for (Character chara : level2Characters) {
            System.out.println(chara);
        }
    }
}