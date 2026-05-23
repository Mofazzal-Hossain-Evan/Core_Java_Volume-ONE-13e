package Video_Game_Character_System;

public final class NightElf extends GameCharacter
        implements Magical, Stealthy, Comparable<NightElf> {

    private int mana;
    private int stealthLevel;

    public NightElf(String name,
                    int level,
                    int heath,
                    String characterClass,
                    int mana,
                    int stealthLevel) {

        super(name, level, heath, characterClass);

        this.mana = mana;
        this.stealthLevel = stealthLevel;
    }

    public int getMana() {
        return mana;
    }

    public int getStealthLevel() {
        return stealthLevel;
    }

    @Override
    public void cast(String spell) {

        System.out.println("🌙 NightElf " + getName()
                + " casts ✨ " + spell);

        System.out.println("🔋 Mana = " + mana);
    }

    @Override
    public void sneak(int level) {

        System.out.println("👣 Sneaking silently...");

        System.out.println("🌑 Stealth Level = " + stealthLevel);
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
    public int compareTo(NightElf o) {
        return 0;
    }

    // remaining methods...
}