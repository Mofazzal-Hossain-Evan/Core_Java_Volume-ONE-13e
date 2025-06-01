package NavalBattleSimulator;

import java.util.Random;

public class Ship {
    private String name;
    private int firePower;
    private int defense;

    public Ship(String name, int fierePower, int defense) {
        this.name = name;
        this.firePower = fierePower;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getFierePower() {
        return firePower;
    }

    public int getDefense() {
        return defense;
    }

    public boolean attact(Ship enemy){
        int attackPower = firePower + new Random().nextInt();
        int defensePower = enemy.getDefense() + new Random().nextInt(10);

        return attackPower > defensePower; // return true if this ship wins
    }
}
