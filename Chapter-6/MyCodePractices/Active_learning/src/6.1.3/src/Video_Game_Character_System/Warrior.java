package Video_Game_Character_System;

public class Warrior extends GameCharacter
        implements Physical, Comparable<Warrior> {

    private int strength;

    public Warrior(String name,
                   int level,
                   int heath,
                   String characterClass,
                   int strength) {

        super(name, level, heath, characterClass);

        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void slash(int power) {

        System.out.println("⚔️ Warrior " + getName()
                + " performs a deadly slash!");

        System.out.println("💪 Strength = " + strength);
    }

    @Override
    public void attack(String target) {
        
    }

    @Override
    public void defend(int shield) {

    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public int compareTo(Warrior o) {
        return 0;
    }

    // remaining methods...
}