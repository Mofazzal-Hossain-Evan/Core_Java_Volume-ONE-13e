package Video_Game_Character_System;

public class GameSystem {
    public static void main(String[] args) {

        Attackable a = new Wizard("Aelric the Wise", 25, 180, "Wizard", 95);
        a.attack("🐉 Dragon");

        GameCharacter c = new NightElf("Lunara MoonWhisper", 33, 280, "NightElf", 92, 47);
        if (c instanceof NightElf) {
            Magical m= (Magical) c;
            m.cast("✨ Meteor Strike");
        }
        Attackable p = new Wizard("Shadow Viper", 27, 240, "Rogue", 45);
        p.attack("💀 Enemy Scout");

        Magical m = new Wizard("Mystra Flameborn", 32, 210, "Wizard", 100);
        int mana = 120;
        if (mana > Magical.MAX_MANA){
            System.out.println("⚠️ Mana Overflow Detected!");
        }

        NightElf els = new NightElf( "Sylven StarArrow",
                29,
                260,
                "NightElf",
                85,
                44);

        els.cast("🌙 Moon Arrow");
        els.sneak(90);

        System.out.println();
        CharacterBehavior cb =
                new Wizard("Zephyrus StormMage", 18, 150, "Wizard", 88);
        System.out.println(cb.getCharacterClass());
        System.out.println();

        Wizard w1 = new Wizard("Aelric the Wise", 25, 180, "Wizard", 95);
        Wizard w2 = new Wizard("Mystra Flameborn", 32, 210, "Wizard", 100);
         Comparable<Wizard> c1 = w1;
        System.out.println("📊 Compare Result: " + c1.compareTo(w2));

        System.out.println();

        GameCharacter Gc = new Rogue("Kairo NightBlade", 19, 200, "Rogue", 41);
        if (Gc instanceof Stealthy s){
            s.sneak(44);
        }


        System.out.println();
        printBattleInfo(new Wizard("Mystra Flameborn", 32, 210, "Wizard", 100));
        printBattleInfo(new Warrior("Leon BladeMaster", 22, 310, "Warrior", 145));
        printBattleInfo(new Rogue("Nyx SilentFoot", 21, 220, "Rogue", 50));

    }

    public static void printBattleInfo(Attackable a){
        System.out.println("════════ BATTLE INFO ════════");
        a.attack("🐉 Training Dummy");
        System.out.println("═════════════════════════════");

    }
}
