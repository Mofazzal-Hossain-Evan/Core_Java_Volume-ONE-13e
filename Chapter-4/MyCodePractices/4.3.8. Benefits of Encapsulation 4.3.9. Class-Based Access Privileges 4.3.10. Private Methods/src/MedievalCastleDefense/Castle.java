package MedievalCastleDefense;

public class Castle {
    private int health = 500;

    private void takeDamage(int damage){
        health -= damage;
        System.out.println("⚔️ Castle takes " + damage + " damage! Remaining health: " + health);
    }

    public void attackCastle(Enemy enemy){
        takeDamage(enemy.attack());
    }

    public boolean isStanding(){
        return health > 0;
    }
}
