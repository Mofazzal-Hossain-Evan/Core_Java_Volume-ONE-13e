package MedievalSiegeSimulator;

public class SiegeGame {
    public static void main(String[] args) {
        Castle castle = new Castle("Iron Fortress", 100);
        SiegeWeapon catapult = new SiegeWeapon("Catapult", 20);
        SiegeWeapon trebuchet = new SiegeWeapon("Trebuchet", 30);

        System.out.println();

        while (!castle.isDestroyed()){
            int damage = (Math.random() > 0.5) ? catapult.attack() : trebuchet.attack();
            castle.takeDamage(damage);

            if (castle.isDestroyed()){
                System.out.println(castle.getName()+"Has fallen");
            }
        }
    }
}
