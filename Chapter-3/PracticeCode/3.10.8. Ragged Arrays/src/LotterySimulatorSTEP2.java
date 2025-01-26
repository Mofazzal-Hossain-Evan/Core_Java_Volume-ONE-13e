import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LotterySimulatorSTEP2 {
    public static void main(String[] args) {

        final int NMAX = 10;
        int[][] combinations = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++) {
            combinations[n] = new int[n + 1];
        }
        for (int n = 0; n < combinations.length; n++) {
            for (int k = 0; k < combinations[n].length; k++) {
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }
                combinations[n][k] = lotteryOdds;
            }
        }

        // simulate lottery

        Scanner scannedInput = new Scanner(System.in);
        System.out.println("\"Enter the number of items to choose from (e.g., 49): \"");
        int n = scannedInput.nextInt();
        System.out.println("Enter the number of selections (e.g., 6): ");
        int k = scannedInput.nextInt();

        //validate input

        if(k > n || k <= 0) {
            System.out.println("Invalid input! Number of selections must be <= items.");
            return;
        }

        // step 4

        System.out.println("Enter your " +k+" lottery numbers (space-separated): ");
        int[] userNumbers =  new int[k];
        for (int i = 0; i < k; i++) {
            userNumbers[i] = scannedInput.nextInt();
        }

        Set<Integer> winingNumber = new HashSet<>();
        Random random = new Random();
        while (winingNumber.size() < k) {
            winingNumber.add(random.nextInt() + 1);
        }

        System.out.println("Winning numbers: " + winingNumber);

        // step 6

        int matches = 6;
        for(int num : userNumbers) {
            if (winingNumber.contains(num)) {
                matches++;
            }
        }

        System.out.println("You matched " + matches + " number(s)!");
        if (matches == k) {
            System.out.println("Congratulations, you hit the jackpot!");
        } else {
            System.out.println("Better luck next time!");
        }

    }
}
