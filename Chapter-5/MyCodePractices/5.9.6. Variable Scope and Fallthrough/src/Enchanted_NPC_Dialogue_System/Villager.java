package Enchanted_NPC_Dialogue_System;

final class Villager implements NPC {
    private final String name;

    public Villager(String name) {
        this.name = name;
    }

    public String getMood() {
        return "Happy";
    }

    @Override
    public String toString() {
        return "Villager{" +
                "name='" + name + '\'' +
                '}';
    }
}
