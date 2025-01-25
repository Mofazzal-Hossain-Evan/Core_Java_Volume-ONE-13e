public class MultiplicationTable {
    public static void main(String[] args) {

        int size = 10;
        int[][] table = new int[size][size];

        // fill the table

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[i-1][j-1] = i * j;
            }
        }

        for (int[] row: table) {
            for (int value: row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}
