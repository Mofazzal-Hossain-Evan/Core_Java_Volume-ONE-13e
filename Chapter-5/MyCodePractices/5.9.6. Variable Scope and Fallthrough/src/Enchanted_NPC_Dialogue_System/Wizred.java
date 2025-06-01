package Enchanted_NPC_Dialogue_System;

final class Wizard implements NPC {
    private final int spellCount;

    public Wizard(int spellCount) {
        this.spellCount = spellCount;
    }

    public int spellCount() {
        return spellCount;
    }

    @Override
    public String toString() {
        return "Wizred with " + spellCount + " spells";
    }
}
