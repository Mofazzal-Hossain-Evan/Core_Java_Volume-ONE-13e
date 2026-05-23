package Video_Game_Character_System;

public final class Wizard extends GameCharacter
        implements Magical, Comparable<Wizard> {

    private int mana;

    public Wizard(String name,
                  int level,
                  int heath,
                  String characterClass,
                  int mana) {

        super(name, level, heath, characterClass);

        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void cast(String spell) {

        System.out.println("🧙 Wizard " + getName()
                + " casts 🔥 " + spell);

        System.out.println("🔋 Current Mana: " + mana);
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
    public int compareTo(Wizard o) {
        return 0;
    }

    // remaining methods...
}