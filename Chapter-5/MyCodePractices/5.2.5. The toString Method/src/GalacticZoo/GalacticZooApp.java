package GalacticZoo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GalacticZooApp {
    public static void main(String[] args) {

        AlienSpecies[] zoo = {
                new AlienSpecies("Blorx", "Zentauri", 8, false),
                new ShapeShifter("Zargloth", "Nebulon-5", 12, true, "Human"),
                new AlienSpecies("Quarn", "Vega-9", 5, true)
        };

        // একাধিক এলিয়েন প্রিন্ট করা — toString() অটো কল হবে
        System.out.println("🪐 Welcome to the Galactic Zoo 🪐");
        System.out.println("Current residents:");
        for (AlienSpecies alien : zoo ) {
            System.out.println("👽 " + alien);
        }

        System.out.println("\nAll alien data in one line:");
        System.out.println(Arrays.toString(zoo));
    }
}
