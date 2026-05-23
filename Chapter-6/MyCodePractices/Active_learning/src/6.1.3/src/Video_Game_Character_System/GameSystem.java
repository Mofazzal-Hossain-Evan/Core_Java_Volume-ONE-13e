package Video_Game_Character_System;

public class GameSystem {

    public static void main(String[] args) {

        // ═════════════════════════════════════
        // ⚔️ POLYMORPHISM TEST
        // ═════════════════════════════════════

        Attackable a = new Wizard("Aelric the Wise", 25, 180, "Wizard", 95);
        a.attack("🐉 Dragon");

        GameCharacter c = new NightElf(
                "Lunara MoonWhisper",
                33,
                280,
                "NightElf",
                92,
                47
        );

        // ✅ SAFE PATTERN MATCHING CAST
        if (c instanceof Magical m) {
            m.cast("✨ Meteor Strike");
        }

        Attackable p = new Rogue("Shadow Viper", 27, 240, "Rogue", 45);
        p.attack("💀 Enemy Scout");

        // ═════════════════════════════════════
        // ⚡ CONSTANT CHECK
        // ═════════════════════════════════════

        int mana = 92;

        if (mana > Magical.MAX_MANA) {
            System.out.println("⚠️ Mana Overflow Detected!");
        } else {
            System.out.println("🔋 Mana is stable: " + mana);
        }

        System.out.println();

        // ═════════════════════════════════════
        // 🌙 NIGHT ELF TEST
        // ═════════════════════════════════════

        NightElf els = new NightElf(
                "Sylven StarArrow",
                29,
                260,
                "NightElf",
                85,
                44
        );

        els.cast("🌙 Moon Arrow");
        els.sneak(90);

        System.out.println();

        // ═════════════════════════════════════
        // 🧬 SEAL / CHARACTER BEHAVIOR
        // ═════════════════════════════════════

        CharacterBehavior cb =
                new Wizard("Zephyrus StormMage", 18, 150, "Wizard", 88);

        System.out.println("🏷️ Class: " + cb.getCharacterClass());

        System.out.println();

        // ═════════════════════════════════════
        // 📊 COMPARABLE TEST
        // ═════════════════════════════════════

        Wizard w1 = new Wizard("Aelric the Wise", 25, 180, "Wizard", 95);
        Wizard w2 = new Wizard("Mystra Flameborn", 32, 210, "Wizard", 100);

        System.out.println("📊 Compare Result: " + w1.compareTo(w2));

        System.out.println();

        // ═════════════════════════════════════
        // 🥷 ROGUE TEST (FIXED)
        // ═════════════════════════════════════

        GameCharacter gc = new Rogue("Kairo NightBlade", 19, 200, "Rogue", 41);

        if (gc instanceof Stealthy s) {
            s.sneak(44);
        }

        System.out.println();

        // ═════════════════════════════════════
        // ⚔️ BATTLE TEST METHOD
        // ═════════════════════════════════════

        printBattleInfo(new Wizard("Mystra Flameborn", 32, 210, "Wizard", 100));
        printBattleInfo(new Warrior("Leon BladeMaster", 22, 310, "Warrior", 145));
        printBattleInfo(new Rogue("Nyx SilentFoot", 21, 220, "Rogue", 50));
    }

    // ═════════════════════════════════════
    // 🎮 BATTLE METHOD
    // ═════════════════════════════════════

    public static void printBattleInfo(Attackable a) {

        System.out.println("════════ BATTLE INFO ════════");
        a.attack("🐉 Training Dummy");
        System.out.println("═════════════════════════════");
    }
}