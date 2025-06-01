package MedievalCastleDefense;

public class SiegeSimulator {
    public static void main(String[] args) {
        Castle castle = new Castle();
        Knight knight = new Knight();
        Enemy enemy = new Enemy("Orc Warlord");

        while (!enemy.isDefeated() && castle.isStanding()) {
            knight.defend(castle, enemy);
            castle.attackCastle(enemy);
        }
        System.out.println(castle.isStanding() ? "🏰 The castle stands strong!" : "💀 The castle has fallen!");
    }

}
