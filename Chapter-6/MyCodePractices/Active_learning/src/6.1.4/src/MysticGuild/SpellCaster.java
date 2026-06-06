package MysticGuild;


public non-sealed interface SpellCaster extends MysticBehavior {

    void castSpell(String target);
    void restoreMana(int amount);
    SpellCaster getApprentice();

    // =====================
    // 6.1.4 — Static Methods (Factory + Utility)
    // =====================
    static String getSpellTier(int mana) {
        return getTierName(mana);
    }

    static boolean isArchmage(int mana) {
        return validateMana(mana);
    }

    static SpellCaster summonFromScroll(String type) {
        return switch (type.toLowerCase()) {
            case "merlin"   -> new Merlin("🧙 Merlin", 9500, 120, "Archmage");
            case "gandalf"  -> new Gandalf("🔮 Gandalf", 9200, 110, "Wizard");
            case "hermione" -> new Hermione("📖 Hermione", 8500, 95, "Prodigy");
            case "morgana"  -> new Morgana("🌑 Morgana", 8800, 100, "Sorceress");
            default         -> new Merlin(type, 3000, 60, "Apprentice");
        };
    }

    // =====================
    // Private Static Helpers — রান্নাঘরের গোপন recipe
    // =====================
    private static boolean validateMana(int mana) {
        return mana > 9000;
    }

    private static String getTierName(int mana) {
        if (mana >= 9000)      return "🌟 ARCHMAGE";
        else if (mana >= 6000) return "🔥 MASTER";
        else if (mana >= 3000) return "✨ ADEPT";
        else                   return "🌱 NOVICE";
    }
}
