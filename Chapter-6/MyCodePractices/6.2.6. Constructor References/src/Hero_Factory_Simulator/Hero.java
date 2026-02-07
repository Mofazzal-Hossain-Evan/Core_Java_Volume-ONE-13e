package Hero_Factory_Simulator;

/* থিয়রি: *Core Java* (p. 274) বলে, কনস্ট্রাক্টর রেফারেন্স (Hero::new) স্ট্রিমে অবজেক্ট তৈরি করে, যা অ্যান্ড্রয়েড গেমে স্পনিং-এ সাহায্য করে। */

public class Hero implements Comparable<Hero> {
    private String name;
    private int powerLevel;

    // Constructor 1: From name (powerLevel inferred from name length)
    public Hero(String name) {
        this.name = name;
        this.powerLevel = name.length() * 10; // Fun inference
    }

    // Constructor 2: From powerLevel (name default)
    public Hero(int powerLevel) {
        this.name = "Hero Level " + powerLevel;
        this.powerLevel = powerLevel;
    }

    // Getters
    public String getName() { return name; }
    public int getPowerLevel() { return powerLevel; }

    @Override
    public int compareTo(Hero other) {
        return Integer.compare(this.powerLevel, other.powerLevel);
    }

    @Override
    public String toString() {
        return name + " (Power: " + powerLevel + ")";
    }
}