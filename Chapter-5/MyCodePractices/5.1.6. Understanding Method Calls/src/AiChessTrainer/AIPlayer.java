package AiChessTrainer;

public class AIPlayer extends Player{

    @Override
    void makeMove(){
        analyzeGame();
        System.out.println("AI analyzes and makes the best move.");

    }

   void analyzeGame(){
       System.out.println("AI is analyzing the board position...");
    }
}
