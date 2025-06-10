package characters;

import core.Character;

public class Warrior extends Character {
    public Warrior(String name, int health, int level) {
        super(name, health, level);
    }

    // ব্যাখ্যা: powerStrike যুদ্ধবীরের আক্রমণ ক্ষমতা।
    public void powerStrike() {
        System.out.println(getName() + " uses powerStrike!");
        setHealth(getHealth() - 10); // সরলতার জন্য হেলথ কমানো
    }
}