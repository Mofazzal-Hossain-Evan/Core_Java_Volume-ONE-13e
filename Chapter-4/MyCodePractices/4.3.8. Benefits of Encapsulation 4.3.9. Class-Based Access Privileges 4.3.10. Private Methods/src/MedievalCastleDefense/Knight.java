package MedievalCastleDefense;

public class Knight {
    public void defend(Castle castle, Enemy enemy) {
        System.out.println("🛡️ Knight fights " + enemy.getName()+ "!");
        enemy.takeDamage(30);
    }
}
