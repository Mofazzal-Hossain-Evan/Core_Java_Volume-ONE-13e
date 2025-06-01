package BoardGame;

public class Main {
    public static void main(String[] args) {
        ChessPlayer p1 = new ChessPlayer("Alice", 1500, "Aggressive", "Sicilian Defense");
        ChessPlayer p2 = new ChessPlayer("Alice", 1500, "Aggressive", "Sicilian Defense");
        ChessPlayer p3 = new ChessPlayer("Bob", 1500, "Aggressive", "Queen's Gambit");

        GoPlayer g1 = new GoPlayer("Charlie", 1700, "Balanced", 40);
        GoPlayer g2 = new GoPlayer("Charlie", 1700, "Balanced", 40);
        GoPlayer g3 = new GoPlayer("Diana", 1700, "Balanced", 50);

        System.out.println("p1 equals p2? " + p1.equals(p2)); // true
        System.out.println("p1 equals p3? " + p1.equals(p3)); // false
        System.out.println("g1 equals g2? " + g1.equals(g2)); // true
        System.out.println("g1 equals g3? " + g1.equals(g3)); // false
        System.out.println("p1 equals g1? " + p1.equals(g1)); // false
    }
}
