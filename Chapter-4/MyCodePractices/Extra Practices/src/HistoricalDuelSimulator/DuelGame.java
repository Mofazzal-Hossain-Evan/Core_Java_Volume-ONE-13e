package HistoricalDuelSimulator;

public class DuelGame {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Leonidas", 100, 20);
        Warrior warrior2 = new Warrior("Genghis Khan", 100, 18);

        System.out.println("The duel begins: " + warrior1.getName() + " vs " + warrior2.getName());

        while(warrior1.isAlive() && warrior2.isAlive()){
            warrior1.attack(warrior2);
            if (!warrior2.isAlive()){
                System.out.println(warrior1.getName() + " wins the duel!");
                break;
            }

            warrior2.attack(warrior1);
            if (!warrior1.isAlive()){
                System.out.println(warrior2.getName() + " wins the duel!");
            }
        }
    }
}
