import java.util.Random;

public class Battleship {

    public static void main(String[] args) {

        int[][] board = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int x = random.nextInt(5);
            int y = random.nextInt(5);
            board[x][y] = 1;
        }

        int guess = 0, hits = 0;
        while (hits < 3) {
            int x = random.nextInt(5);
            int y = random.nextInt(5);

            if (board[x][y] == 1) {
                hits++;
                board[x][y] = 0;
                System.out.println("Hit at (" + x + ", " + y + ")");
            }
            guess++;

        }
        System.out.println("Game Over! Total Guesses: " + guess);
    }
}
