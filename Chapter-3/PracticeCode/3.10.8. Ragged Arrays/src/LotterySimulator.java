public class LotterySimulator {
    public static void main(String[] args) {

        final int NMAX = 10;

        int[][] combinations = new int[NMAX + 1][];
        for (int n=0; n<= NMAX; n++) {
            combinations[n] = new int[n + 1];
        }

        for (int n = 0; n < combinations.length; n++) {
            for (int k = 0; k < combinations[n].length; k++) {
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n-i +1) / i;
                }
            }
        }

        System.out.println("Lottery combinations table:");
        for (int[] row : combinations) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}
