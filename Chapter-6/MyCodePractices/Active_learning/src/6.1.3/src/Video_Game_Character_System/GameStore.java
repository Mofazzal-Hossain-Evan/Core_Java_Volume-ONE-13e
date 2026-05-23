package Video_Game_Character_System;

public class GameStore {

    private GameCharacter[] characters;

    public GameStore() {

        characters = new GameCharacter[]{

                // ═══════════════════════════════════════
                // 🧙 WIZARD × 3
                // ═══════════════════════════════════════

                new Wizard(
                        "Aelric the Wise",
                        25,
                        180,
                        "Wizard",
                        95
                ),

                new Wizard(
                        "Mystra Flameborn",
                        32,
                        210,
                        "Wizard",
                        100
                ),

                new Wizard(
                        "Zephyrus StormMage",
                        18,
                        150,
                        "Wizard",
                        88
                ),

                // ═══════════════════════════════════════
                // ⚔️ WARRIOR × 3
                // ═══════════════════════════════════════

                new Warrior(
                        "Thorgar IronFist",
                        40,
                        420,
                        "Warrior",
                        170
                ),

                new Warrior(
                        "Ragnar SkullCrusher",
                        35,
                        390,
                        "Warrior",
                        160
                ),

                new Warrior(
                        "Leon BladeMaster",
                        22,
                        310,
                        "Warrior",
                        145
                ),

                // ═══════════════════════════════════════
                // 🥷 ROGUE × 3
                // ═══════════════════════════════════════

                new Rogue(
                        "Shadow Viper",
                        27,
                        240,
                        "Rogue",
                        45
                ),

                new Rogue(
                        "Nyx SilentFoot",
                        21,
                        220,
                        "Rogue",
                        50
                ),

                new Rogue(
                        "Kairo NightBlade",
                        19,
                        200,
                        "Rogue",
                        41
                ),

                // ═══════════════════════════════════════
                // 🌙 NIGHT ELF × 2
                // ═══════════════════════════════════════

                new NightElf(
                        "Lunara MoonWhisper",
                        33,
                        280,
                        "NightElf",
                        92,
                        47
                ),

                new NightElf(
                        "Sylven StarArrow",
                        29,
                        260,
                        "NightElf",
                        85,
                        44
                )
        };
    }

    // ═══════════════════════════════════════
    // ✅ Getter Method
    // ═══════════════════════════════════════

    public GameCharacter[] getCharacters() {

        return characters;
    }
}