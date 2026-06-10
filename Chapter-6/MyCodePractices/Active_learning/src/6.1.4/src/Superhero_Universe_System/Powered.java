package Superhero_Universe_System;

public non-sealed interface Powered
        extends SuperBehavior {

    void    usePower(String target);
    void    recharge(int energy);
    Powered getSidekick();

    // =====================
    // 6.1.4 — Static Methods
    // =====================
    //
    // 📚 Companion Class এর গল্প:
    //
    // পুরনো Java তে এভাবে করতে হতো:
    //   HeroPowers.classify(9000)   ← আলাদা companion class
    //   HeroPowers.isOverpowered(9000)
    //
    // Java 8 এর পরে এভাবে করা যায়:
    //   Powered.classify(9000)      ← Interface এর ভেতরেই!
    //   Powered.isOverpowered(9000)
    //
    // ঠিক যেমন:
    //   Paths.of("/home") → পুরনো
    //   Path.of("/home")  → নতুন (Java 8+)
    //
    // ⚠️ গুরুত্বপূর্ণ নিয়ম:
    //    Static method implementing class এ inherit হয় না!
    //    IronMan.classify(9000)  → COMPILE ERROR ❌
    //    Powered.classify(9000)  → সঠিক ✔

    static String classify(int powerLevel) {
        return getPowerTier(powerLevel);
    }

    static boolean isOverpowered(int level) {
        return checkLevel(level);
    }

    static Powered fromType(String type) {
        return switch (type.toLowerCase()) {
            case "ironman" -> new IronMan("🦾 Iron Man", 8000, 100, "Tech");
            case "thor"    -> new Thor("⚡ Thor",         9500, 150, "God");
            case "profx"   -> new ProfX("🧠 Prof X",     7000, 80,  "Mutant");
            default        -> new IronMan(type,           1000, 50,  "Unknown");
        };
    }

    // =====================
    // 6.1.4 — Private Static Methods
    // static method এর গোপন helper
    // =====================

    private static boolean checkLevel(int level) {
        return level > 9000;
    }

    private static String getPowerTier(int level) {
        if (level >= 9000)      return "🔥 GODLIKE";
        else if (level >= 5000) return "⚡ LEGENDARY";
        else if (level >= 1000) return "💪 POWERFUL";
        else                    return "🌱 NOVICE";
    }
}