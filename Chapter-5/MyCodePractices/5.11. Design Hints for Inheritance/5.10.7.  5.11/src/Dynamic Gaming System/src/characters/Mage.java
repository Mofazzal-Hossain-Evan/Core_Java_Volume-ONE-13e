package characters;

import core.Character;

public class Mage extends Character {
    public Mage(String name, int health, int level) {
        super(name, health, level);
    }

    public void castSpell(){
        System.out.println(getName() + " casts a spell!");
        setHealth(getHealth() -5);
    }
}
