package AiChessTrainer;

public class ChessGame {
    void startGame(Player p1) {
        System.out.println("Starting game with one player against AI.");
        p1.makeMove();
    }

    void startGame(Player p1, Player p2){
        System.out.println("Starting game between two players.");
        p1.makeMove();
        p2.makeMove();
    }
}
