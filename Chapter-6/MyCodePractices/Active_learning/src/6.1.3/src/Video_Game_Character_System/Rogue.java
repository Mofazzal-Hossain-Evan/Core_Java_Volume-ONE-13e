package Video_Game_Character_System;

public class Rogue extends GameCharacter
        implements Stealthy, Comparable<Stealthy> {

    private int stealthLevel;

    public Rogue(String name,
                 int level,
                 int heath,
                 String characterClass,
                 int stealthLevel) {

        super(name, level, heath, characterClass);

        this.stealthLevel = stealthLevel;
    }

    public int getStealthLevel() {
        return stealthLevel;
    }

    @Override
    public void sneak(int level) {

        System.out.println("🥷 Rogue " + getName()
                + " hides in darkness!");

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
    public int compareTo(Stealthy o) {
        return 0;
    }

    // remaining methods...
}