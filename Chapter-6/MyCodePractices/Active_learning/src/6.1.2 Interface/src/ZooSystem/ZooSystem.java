package ZooSystem;

import java.util.Arrays;

public class ZooSystem {

    public static void main(String[] args) {



        // Correct Absolute Path based on your actual folder structure
        String basePath = "C:/Users/evan/Documents/GitHub/Core_Java_Volume-ONE-13e/Chapter-6/MyCodePractices/Active_learning/src/6.1.2 Interface/src/ZooSystem/";

        ZooStore store = new ZooStore(
                basePath + "data/eagles.csv",
                basePath + "data/sharks.csv",
                basePath + "data/cheetahs.csv",
                basePath + "data/ducks.csv"
        );

            // Rest of your code remains the same...
        Animal[] animals = store.getAnimals();
        System.out.println("Total animals: " + animals.length);

        // 1. instanceof check
        System.out.println("\n=== 1. instanceof check ===");
        for (Animal a : animals) {
            if (a instanceof Flyable)    System.out.println(a.getName() + " → Flyable ✔");
            if (a instanceof Swimmable)  System.out.println(a.getName() + " → Swimmable ✔");
            if (a instanceof Runnerable) System.out.println(a.getName() + " → Runnerable ✔");
        }

        // 2. Interface Polymorphism
        System.out.println("\n=== 2. Interface Polymorphism ===");
        Livable l1 = new Eagle("Test Eagle", 3, 5.0, "Mountain");
        l1.eat("Rabbit", 1.5);
        l1.sleep(6);

        // 3. Constant check
        System.out.println("\n=== 3. Constant check ===");
        for (Animal a : animals) {
            if (a instanceof Flyable f)    f.fly(2500);
            if (a instanceof Swimmable s)  s.swim(300);
            if (a instanceof Runnerable r) r.run(95);
        }

        // 4. Sealed interface test
        System.out.println("\n=== 4. Sealed interface ===");
        AnimalBehavior ab = new Duck("Mallard", 2, 1.2, "Wetland");
        System.out.println(ab.getHabitat());

        // 5. Pattern matching instanceof
        System.out.println("\n=== 5. Pattern matching ===");
        Object[] mixed = {
                new Eagle("Eagle", 5, 6.5, "Mountain"),
                new Duck("Duck", 2, 1.2, "Wetland"),
                "Random String",
                42
        };
        for (Object item : mixed) {
            if      (item instanceof Flyable f)    f.fly(1000);
            else if (item instanceof Swimmable s)  s.swim(200);
            else if (item instanceof Comparable<?> c)
                System.out.println("Comparable: " + item.getClass().getSimpleName());
            else
                System.out.println("Unknown: " + item);
        }

        // 6. Comparable + Generic method
        System.out.println("\n=== 6. Comparable + Generic ===");
        Eagle e1 = new Eagle("Golden Eagle", 5, 6.5, "Mountain");
        Eagle e2 = new Eagle("Bald Eagle",   8, 9.0, "Forest");
        processData(e1, e2);
    }

    public static <T extends Comparable<T>> void processData(T a, T b) {
        int result = a.compareTo(b);
        if      (result > 0) System.out.println(a + " is heavier");
        else if (result < 0) System.out.println(b + " is heavier");
        else                 System.out.println("equal weight");
    }
}