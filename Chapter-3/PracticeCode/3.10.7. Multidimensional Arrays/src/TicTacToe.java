import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (char[] row: board) Arrays.fill(row, ' ');
        Scanner input = new Scanner(System.in);
        char currentPlayer = 'x';

        while(true) {
            for (char[] row : board) {
                for (char cell : row) {
                    System.out.println("I" + cell);
                }
                System.out.println("I");
            }

            //player move
            System.out.printf("Player %c, enter your move (row and column): ", currentPlayer);
            int row = input.nextInt() -1;
            int col = input.nextInt() -1;

            if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            currentPlayer = (currentPlayer == 'x') ? 'o': 'x';
            } else {
                System.out.println("Cell already taken! Try again.");
            }
            }





    }
}
