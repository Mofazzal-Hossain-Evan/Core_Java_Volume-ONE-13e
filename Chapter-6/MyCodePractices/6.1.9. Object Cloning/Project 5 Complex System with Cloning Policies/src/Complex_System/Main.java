package Complex_System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create objects
        Artifact artifact = new Artifact("Ancient Relic");
        GameCharacter hero = new GameCharacter("Captain Bugfix", artifact);
        hero.addWeapon(new Weapon("Code Debugging Beam", 50));
        hero.addWeapon(new Weapon("NullPointer Sword", 70));

        // Shallow clone
        GameCharacter shallowClone = (GameCharacter) hero.cloneComponent(ClonePolicy.SHALLOW);

        // Deep clone
        GameCharacter deepClone = (GameCharacter) hero.cloneComponent(ClonePolicy.DEEP);

        // Modify shallow clone
        shallowClone.addWeapon(new Weapon("Memory Leak Bow", 40));

        // Modify deep clone
        deepClone.addWeapon(new Weapon("Thread Synchronizer Hammer", 90));

        // Print results
        System.out.println("Original:      " + hero);
        System.out.println("Shallow Clone: " + shallowClone);
        System.out.println("Deep Clone:    " + deepClone);
    }
}

