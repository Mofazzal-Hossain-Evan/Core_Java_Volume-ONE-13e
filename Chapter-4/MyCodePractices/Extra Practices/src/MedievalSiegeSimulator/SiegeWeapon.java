package MedievalSiegeSimulator;

import java.util.Random;

public class SiegeWeapon {
    private String name;
    private int damage;

    public SiegeWeapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int attack(){
        return damage + new Random().nextInt(); // randomize attack power
    }
}
