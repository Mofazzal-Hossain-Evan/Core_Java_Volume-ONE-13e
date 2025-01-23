import java.util.Arrays;
import java.util.Scanner;

public class MagicSquareValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = input.nextInt();

        int[][] square = new int[n][n];
        System.out.println("Enter the square values row by row: ");

        //input square value
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = input.nextInt();
            }
        }

        // validate magic square
        if (isMagicSquare(square)) {
            System.out.println("Enter the square values row by row:");
        } else {
            System.out.println("This is NOT a magic square.");
        }
    }

    private static boolean isMagicSquare(int[][] square) {
        int n = square.length;
        int magicSum = Arrays.stream(square[0]).sum();


        //check row column
        for (int i = 0; i <n; i++) {
            if(Arrays.stream(square[i]).sum() != magicSum) return false;
            int finalI = i;
            if (Arrays.stream(square).mapToInt(row -> row[finalI]).sum() != magicSum) return false; // Column sum
        }

        // check originals
        int diag1 = 0, diag2 = 0;
        for (int i =0; i < n; i++) {
            diag1 += square[i][i];
            diag2 += square[i][n -i - 1];
        }

        return  diag1 == magicSum && diag2 == magicSum;
    }
}

