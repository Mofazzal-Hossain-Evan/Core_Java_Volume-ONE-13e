package Superhero_Universe_System;
public class SuperheroSystem {

    public static void main(String[] args) {

        HeroStore store = new HeroStore();
        Hero[] heroes = store.getHeroes();

        System.out.println("🦸 Total heroes: " + heroes.length);
        System.out.println();

        // =========================
        // 1. Companion Class → Static Method — 6.1.4 ★
        // =========================
        // Used Interface: Powered
        // Methods used: classify(), isOverpowered(), fromType()  ← All are static methods
        System.out.println("=== 1. 📚 Companion Class vs Static Method (6.1.4) ===");
        System.out.println("🕰️ পুরনো পদ্ধতি (Companion Class):");
        System.out.println("   HeroPowers.classify(9000) ← আলাদা class দরকার ছিল");
        System.out.println();
        System.out.println("✨ নতুন পদ্ধতি (Java 8 Static Method in Interface):");

        System.out.println("   " + Powered.classify(15000) + " [15000]");
        System.out.println("   " + Powered.classify(9000)  + " [9000]");
        System.out.println("   " + Powered.classify(3000)  + " [3000]");
        System.out.println("   " + Powered.classify(500)   + " [500]");

        System.out.println();
        System.out.println("isOverpowered(8000):  " + Powered.isOverpowered(8000));
        System.out.println("isOverpowered(15000): " + Powered.isOverpowered(15000));

        // fromType() returns Powered type (Interface)
        Powered fromType = Powered.fromType("thor");
        System.out.println("fromType(thor): " + fromType);

        System.out.println();

        // =========================
        // 2. Static method NOT inherited — 6.1.4 ★
        // =========================
        // Used Interface: Powered
        // Methods used: classify()  ← Static method (not inherited by IronMan)
        System.out.println("=== 2. ⚠️ Static NOT Inherited (6.1.4) ===");
        System.out.println("❌ IronMan.classify(9000) → COMPILE ERROR! (Static methods are not inherited)");
        System.out.println("✔ Powered.classify(9000) → সঠিক! (Called via Interface)");
        System.out.println("  " + Powered.classify(9000));

        System.out.println();

        // =========================
        // 3. DRY Principle — Private Method — 6.1.4 ★
        // =========================
        // Used Interface: Flyable (which extends Powered)
        // Methods used:
        //   - canFlyHigh()          → default method
        //   - getFlightStatus()     → default method
        //   - checkAltitude() & checkStamina() → private methods (inside Flyable)
        System.out.println("=== 3. 🔒 DRY + Private Method (6.1.4) ===");

        IronMan ironMan = new IronMan("🦾 Iron Man", 8000, 100, "Tech");

        System.out.println("💡 একই private checkAltitude() দুটো default method এ ব্যবহার:");
        System.out.println("canFlyHigh(5000):  " + ironMan.canFlyHigh(5000));
        System.out.println("canFlyHigh(15000): " + ironMan.canFlyHigh(15000));
        System.out.println("getFlightStatus(5000):  " + ironMan.getFlightStatus(5000));
        System.out.println("getFlightStatus(15000): " + ironMan.getFlightStatus(15000));

        System.out.println();

        // =========================
        // 4. Interface Variable — 6.1.2
        // =========================
        // Used Interface: Powered
        // Methods used: usePower()
        System.out.println("=== 4. 📦 Interface Variable (6.1.2) ===");

        Powered p1 = new IronMan("🦾 Iron Man", 8000, 100, "Tech");     // IronMan implements Powered
        Powered p2 = new JeanGrey("🔴 Jean Grey", 9000, 120, "Mutant"); // JeanGrey implements Powered

        p1.usePower("🐉 Thanos");
        p2.usePower("🐉 Thanos");

        System.out.println();

        // =========================
        // 5. instanceof check — 6.1.2
        // =========================
        // Used Interfaces: Flyable, Telepathic, Blastable
        System.out.println("=== 5. 🔍 instanceof Check (6.1.2) ===");

        for (Hero h : heroes) {
            if (h instanceof Flyable) {
                System.out.println(h.getName() + " can fly 🚀");
            }
            if (h instanceof Telepathic) {
                System.out.println(h.getName() + " is telepathic 🧠");
            }
            if (h instanceof Blastable) {
                System.out.println(h.getName() + " can blast 💥");
            }
        }

        System.out.println();

        // =========================
        // 6. Polymorphism — 6.1.2
        // =========================
        // Used Interface: Flyable
        // Method used: fly()
        System.out.println("=== 6. 🔄 Polymorphism (6.1.2) ===");

        Flyable flyer1 = new Thor("⚡ Thor",       9500, 150, "God");
        Flyable flyer2 = new JeanGrey("🔴 Jean",  9000, 120, "Mutant");
        Flyable flyer3 = new IronMan("🦾 Tony",   8000, 100, "Tech");

        flyer1.fly(8000);   // Thor's fly()
        flyer2.fly(3000);   // JeanGrey's fly()
        flyer3.fly(12000);  // IronMan's fly()

        System.out.println();

        // =========================
        // 7. Constant check — 6.1.2
        // =========================
        // Used Interfaces: Blastable, Flyable, Telepathic
        // Constants used: MAX_BLAST, MAX_HEIGHT, MAX_RANGE
        System.out.println("=== 7. 📏 Constant Check (6.1.2) ===");

        double safeBlast   = 5000;
        double dangerBlast = 10000;

        if (safeBlast > Blastable.MAX_BLAST) {
            System.out.println("💥 " + safeBlast + " → OVERLOAD ❌");
        } else {
            System.out.println("💥 " + safeBlast + " → Safe ✅");
        }

        System.out.println("MAX_HEIGHT = " + Flyable.MAX_HEIGHT   + "m 🚀");
        System.out.println("MAX_BLAST  = " + Blastable.MAX_BLAST  + " TW 💥");
        System.out.println("MAX_RANGE  = " + Telepathic.MAX_RANGE + " km 🧠");

        System.out.println();

        // =========================
        // 8. Multiple implements — 6.1.3
        // =========================
        // Used Class: JeanGrey
        // Interfaces: Flyable, Telepathic, Powered
        // Methods: fly(), readMind(), controlMind(), usePower()
        System.out.println("=== 8. 🔴 Multiple Implements (6.1.3) ===");

        JeanGrey jean = new JeanGrey("🔴 Jean Grey", 9000, 120, "Mutant");
        jean.fly(5000);                    // From Flyable
        jean.readMind("🐉 Thanos");        // From Telepathic
        jean.controlMind("👹 Loki");       // From Telepathic
        jean.usePower("🌍 Earth");         // From Powered

        System.out.println();

        // =========================
        // 9. Sealed Interface — 6.1.2
        // =========================
        // Used Interface: SuperBehavior
        System.out.println("=== 9. 🔒 Sealed Interface (6.1.2) ===");

        SuperBehavior sb1 = new IronMan("🦾 Iron Man",   8000, 100, "Tech");
        SuperBehavior sb2 = new JeanGrey("🔴 Jean Grey", 9000, 120, "Mutant");

        System.out.println("IronMan class:  "  + sb1.getHeroClass());
        System.out.println("JeanGrey class: "  + sb2.getHeroClass());

        System.out.println();

        // =========================
        // 10. CharSequence / Universal Remote idea — 6.1.3
        // =========================
        System.out.println("=== 10. 🌐 CharSequence / Universal Remote Idea (6.1.3) ===");

        System.out.println("--- ⚡ Part A: Universal Remote ---");
        showHeroInfo(new IronMan("🦾 Iron Man",    8000, 100, "Tech"));
        showHeroInfo(new Thor("⚡ Thor",            9500, 150, "God"));
        showHeroInfo(new JeanGrey("🔴 Jean Grey",   9000, 120, "Mutant"));

        System.out.println("\n🎉 6.1.4 + 6.1.3 + 6.1.2 — All covered! 🦸⚡🔥");
    }

    /**
     * Universal Remote Example (CharSequence idea)
     * Parameter type: Powered (Interface)
     * Can accept any class that implements Powered: IronMan, Thor, JeanGrey, etc.
     */
    public static void showHeroInfo(Powered p) {
        System.out.println("🦸 --- Hero Info ---");
        p.usePower("🎯 Training Dummy");   // Powered interface method
        p.recharge(100);                   // Powered interface method
    }
}
