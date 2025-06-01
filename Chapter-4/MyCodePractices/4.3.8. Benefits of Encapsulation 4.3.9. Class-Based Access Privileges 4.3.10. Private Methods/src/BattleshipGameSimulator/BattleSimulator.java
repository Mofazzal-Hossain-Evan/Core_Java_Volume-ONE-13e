package BattleshipGameSimulator;

import java.util.Random;

public class BattleSimulator {
    public static void main(String[] args) {

        Ship[] fleet1_Ship = {
                new Ship("HMS Victory", 100, 20),
                new Ship("Black Pearl", 120, 15),
                new Ship("USS Constitution", 90, 25)
        };
        Ship[] fleet2Ships = {
                new Ship("Bismarck", 150, 18),
                new Ship("Yamato", 160, 20),
                new Ship("Hood", 110, 22)
        };

        Fleet fleet1 = new Fleet(fleet1_Ship);
        Fleet fleet2 = new Fleet(fleet2Ships);

        Random random = new Random();
        System.out.println("⚓️ Battle begins!");

        while(fleet1.hasSurvivingShips() && fleet2.hasSurvivingShips()){
            Ship attacker = fleet1.getRandomAvailableShip();

            //The variable Ship in this case is a class type variable (also called a reference variable).
            // It represents an object of the Ship class.
            Ship defender = fleet2.getRandomAvailableShip();

            defender.takeDamage(attacker.attack());
            System.out.println(attacker.getName()+" attack "+ defender.getName());

            if (fleet2.hasSurvivingShips()){
                Ship counterAttacker = fleet2.getRandomAvailableShip();
                Ship counterDefender = fleet1.getRandomAvailableShip();

                counterDefender.takeDamage(counterAttacker.attack());
                System.out.println(counterAttacker.getName() +"counterAttack" + counterDefender);
            }
        }
        System.out.println(fleet1.hasSurvivingShips() ? "Fleet 1 Wins! 🎉" : "Fleet 2 Wins! 🎉");

    }
}
