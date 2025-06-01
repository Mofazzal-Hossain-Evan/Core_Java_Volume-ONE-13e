package MedievalCastleDefense;

import java.util.Random;

public class Enemy {

    private String name;
    private int health = 100;
    private Random random = new Random();

    public Enemy(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int attack(){
        return random.nextInt(20)+20;
    }

    public void takeDamage(int damage){
        health -= damage;
        System.out.println(name + " takes " + damage + " damage!");

    }

    public boolean isDefeated(){
        return health <= 0;
    }
}
