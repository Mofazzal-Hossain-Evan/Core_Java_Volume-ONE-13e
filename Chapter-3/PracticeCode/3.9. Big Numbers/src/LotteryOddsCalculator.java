import java.math.BigInteger;
import java.util.Scanner;

public class LotteryOddsCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("How many numbers do you need to draw? ");
            int k = in.nextInt();

            System.out.print("What is the highest number you can draw? ");
            BigInteger n = in.nextBigInteger();

            BigInteger lottaryOdds = BigInteger.ONE;

            for (int i = 1; i<= k; i++) {
                lottaryOdds = lottaryOdds .multiply(n.subtract(BigInteger.valueOf(i-1))).divide(BigInteger.valueOf(i));
            }
            System.out.printf("Your odds are 1 in %s. Good luck!%n", lottaryOdds);

            System.out.print("Do you want to calculate another lottery? (yes/no): ");
            String choise = in.next();
            if (!choise.equalsIgnoreCase("yes")) break;
        }
        in.close();
    }
}
