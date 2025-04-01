package AiChessTrainer;

public class AIChessTrainer {
    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        Player human = new Player();
        AIPlayer ai = new AIPlayer();

        game.startGame(human);
        game.startGame(human, ai);

        // Method Overriding & Dynamic Binding
        Player player = new AIPlayer();  // Upcasting
        player.makeMove(); // Calls AIPlayer's makeMove method
    }
}
