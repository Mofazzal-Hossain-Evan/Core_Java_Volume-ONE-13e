package PetShopSystem;

public class PetShopSystem {

    public static void main(String[] args) {

        PetStore store = new PetStore();
        Pet[] pets = store.getPets();

        System.out.println("Total pets: " + pets.length);
        System.out.println();

        // =========================
        // 1. Interface Variable
        // =========================
        System.out.println("=== 1. Interface Variable ===");

        Trainable t1 = new Dog("Bruno", 3, 500.0, "Labrador");
        Trainable t2 = new Cat("Luna",  1, 250.0, "Siamese");

        t1.train("Sit");
        t2.train("High Five");

        System.out.println();

        // =========================
        // 2. instanceof check
        // =========================
        System.out.println("=== 2. instanceof Check ===");

        for (Pet p : pets) {
            if (p instanceof Cuddlable) {
                System.out.println(p.getName() + " is Cuddlable 🐾");
            }
            if (p instanceof Wildable) {
                System.out.println(p.getName() + " is Wildable 🐯");
            }
        }

        System.out.println();

        // =========================
        // 3. Interface Polymorphism
        // =========================
        System.out.println("=== 3. Interface Polymorphism ===");

        Trainable pet1 = new Dog("Rocky", 4, 600.0, "German Shepherd");
        Trainable pet2 = new Tiger("Shere Khan", 5, 5000.0, "Bengal");

        pet1.train("Roll Over");
        pet2.train("Sit");

        System.out.println();

        // =========================
        // 4. Constant check
        // =========================
        System.out.println("=== 4. Constant Check ===");

        int safeMinutes   = 30;
        int dangerMinutes = 90;

        if (safeMinutes > Cuddlable.MAX_CUDDLE) {
            System.out.println(safeMinutes + " mins — Too long! ❌");
        } else {
            System.out.println(safeMinutes + " mins — OK ✔");
        }

        if (dangerMinutes > Cuddlable.MAX_CUDDLE) {
            System.out.println(dangerMinutes + " mins — Too long! ❌");
        } else {
            System.out.println(dangerMinutes + " mins — OK ✔");
        }

        System.out.println("MAX_CUDDLE = " + Cuddlable.MAX_CUDDLE);
        System.out.println("MAX_GROWL  = " + Wildable.MAX_GROWL);

        System.out.println();

        // =========================
        // 5. Multiple implements — 6.1.3 ★
        // =========================
        System.out.println("=== 5. Multiple Implements (Tiger) ===");

        // 💡 6.1.3 — interface body নেই → conflict নেই
        // class Tiger extends Cuddlable, Wildable → ERROR!
        // কিন্তু implements Cuddlable, Wildable → OK ✔

        Tiger tiger = new Tiger("Rajah", 3, 4500.0, "Siberian");
        tiger.cuddle(5);    // Cuddlable থেকে
        tiger.growl(8);     // Wildable থেকে
        tiger.train("Roar on command");

        System.out.println();

        // =========================
        // 6. Sealed Interface
        // =========================
        System.out.println("=== 6. Sealed Interface ===");

        PetBehavior pb1 = new Dog("Max",        2, 450.0,  "Bulldog");
        PetBehavior pb2 = new Tiger("Shere Khan",5, 5000.0, "Bengal");

        System.out.println("Dog species:   " + pb1.getSpecies());
        System.out.println("Tiger species: " + pb2.getSpecies());
        System.out.println("pb1 instanceof PetBehavior: " + (pb1 instanceof PetBehavior));

        System.out.println();

        // =========================
        // 7. Comparable variable
        // =========================
        System.out.println("=== 7. Comparable Variable ===");

        Comparable<Dog> cd1 = new Dog("Bruno", 3, 500.0, "Labrador");
        Comparable<Dog> cd2 = new Dog("Max",   2, 450.0, "Bulldog");

        int result = cd1.compareTo((Dog) cd2);

        if (result > 0) {
            System.out.println("cd1 is more expensive");
        } else if (result < 0) {
            System.out.println("cd1 is cheaper");
        } else {
            System.out.println("same price");
        }

        System.out.println();

        // =========================
        // 8. Pattern matching
        // =========================
        System.out.println("=== 8. Pattern Matching instanceof ===");

        Object[] mixed = {
                new Dog("Bruno",        3, 500.0,  "Labrador"),
                new Cat("Whiskers",     2, 300.0,  "Persian"),
                new Tiger("Rajah",      3, 4500.0, "Siberian"),
                "Random String",
                42
        };

        for (Object item : mixed) {
            if (item instanceof Wildable w) {
                w.growl(5);
            } else if (item instanceof Cuddlable c) {
                c.cuddle(10);
            } else if (item instanceof Comparable<?>) {
                System.out.println("Comparable: " +
                        item.getClass().getSimpleName());
            } else {
                System.out.println("Unknown → " + item);
            }
        }

        System.out.println();

        // =========================
        // 9. CharSequence idea — 6.1.3 ★
        // =========================
        System.out.println("=== 9. CharSequence Idea ===");

        // Part A — Universal Remote
        // showPetInfo(Trainable t) — একটাই method
        // Dog দাও, Cat দাও, Tiger দাও — সব চলে

        System.out.println("--- Part A: Universal Remote ---");
        showPetInfo(new Dog("Rocky",        4, 600.0,  "German Shepherd"));
        showPetInfo(new Cat("Mochi",        3, 400.0,  "Maine Coon"));
        showPetInfo(new Tiger("Shere Khan", 5, 5000.0, "Bengal"));

        System.out.println();

        // Part B — subSequence idea
        // getJuniorVersion() → Trainable return করে
        // interface নিজেকেই return type হিসেবে ব্যবহার
        // ঠিক যেমন subSequence() → CharSequence return করে

        System.out.println("--- Part B: subSequence idea ---");
        Trainable dog   = new Dog("Bruno",        3, 500.0,  "Labrador");
        Trainable cat   = new Cat("Whiskers",     2, 300.0,  "Persian");
        Trainable tiger_part8 = new Tiger("Rajah",      3, 4500.0, "Siberian");

        Trainable juniorDog   = dog.getJuniorVersion();
        Trainable juniorCat   = cat.getJuniorVersion();
        Trainable juniorTiger = tiger.getJuniorVersion();

        juniorDog.train("Sit");
        juniorCat.train("Wave");
        juniorTiger.train("Roar");

        System.out.println();
        System.out.println("=== Section 6.1.3 — All concepts covered! ===");
    }

    // =========================
    // CharSequence Universal Remote idea
    // =========================
    public static void showPetInfo(Trainable t) {
        System.out.println("--- Pet Info ---");
        t.train("Basic Command");
        t.feed("Daily Meal");
    }
}