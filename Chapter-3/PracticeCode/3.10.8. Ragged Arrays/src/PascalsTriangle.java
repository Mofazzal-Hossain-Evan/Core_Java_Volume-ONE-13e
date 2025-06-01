import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scannedIn = new Scanner(System.in);

        System.out.println("Enter the number of rows for Pascal's Triangle: ");
        int numRow = scannedIn.nextInt();

        int[][] triangle = new int[numRow][];

        for (int i = 0; i < numRow; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i -1][j -1] + triangle[i -1][j];
            }
        }

        for (int[] row : triangle) {
            for (int value : row) {
                System.out.print(value +" ");
            }
            System.out.println();
        }
    }
}
