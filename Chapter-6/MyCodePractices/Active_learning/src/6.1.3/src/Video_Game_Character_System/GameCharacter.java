package Video_Game_Character_System;

public abstract non-sealed class GameCharacter implements CharacterBehavior{
    String name;
    int level;
    int heath;
    String characterClass;

    public GameCharacter(String name, int level, int heath, String characterClass) {
        this.name = name;
        this.level = level;
        this.heath = heath;
        this.characterClass = characterClass;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHeath() {
        return heath;
    }

    @Override
    public String getCharacterClass() {
        return characterClass;
    }
}
