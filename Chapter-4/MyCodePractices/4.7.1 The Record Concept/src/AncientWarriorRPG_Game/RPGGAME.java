package AncientWarriorRPG_Game;

import java.util.Random;

record Warrior(String name, int health, int attackPower){
    public boolean isAlive(){
        return health > 0;
    }

    public Warrior attack(Warrior enemy){
        Random random = new Random();
        int damage = random.nextInt(attackPower);
        return new Warrior(enemy.name, enemy.health - damage, enemy.attackPower);
    }
}
public class RPGGAME {

    public static void main(String[] args) {
        Warrior samurai = new Warrior("Samurai", 100, 20);
        Warrior viking = new Warrior("Viking", 100, 25);

        System.out.println(samurai.name() + " vs " + viking.name() + " - Battle Begins! ⚔️");

        while (samurai.isAlive() && viking.isAlive()) {
            viking = samurai.attack(viking);
            if (!viking.isAlive()) break;

            samurai = viking.attack(samurai);
        }

        System.out.println("🏆 Winner: " + (samurai.isAlive() ? samurai.name() : viking.name()));
    }
}
