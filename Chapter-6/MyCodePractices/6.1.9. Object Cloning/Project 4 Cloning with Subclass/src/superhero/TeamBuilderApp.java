package superhero;

/**
 * Main app to test cloning with subclasses
 */
public class TeamBuilderApp {
    public static void main(String[] args) {
        // Original heroes
        Mage mage = new Mage("Wizard of NullPointer", 88.5, 120);
        mage.addAbility("Fireball");
        mage.addAbility("Code Spell");

        Warrior warrior = new Warrior("Captain Bugfix", 95.0, "Debugging Sword");
        warrior.addAbility("Code Debugging Beam");

        // Clone heroes
        Mage mageClone = mage.clone();
        mageClone.addAbility("Teleport");
        mageClone.powerLevel = 99.9;

        Warrior warriorClone = warrior.clone();
        warriorClone.addAbility("Infinite Loop Breaker");
        warriorClone.powerLevel = 80.0;

        // Print originals and clones
        System.out.println("Original Mage: " + mage);
        System.out.println("Cloned Mage:   " + mageClone);
        System.out.println();
        System.out.println("Original Warrior: " + warrior);
        System.out.println("Cloned Warrior:   " + warriorClone);

        System.out.println("\n--- Team Simulation ---");
        Superhero[] team = {mage, warrior, mageClone, warriorClone};
        for (Superhero hero : team) {
            System.out.println(hero);
        }
    }
}
