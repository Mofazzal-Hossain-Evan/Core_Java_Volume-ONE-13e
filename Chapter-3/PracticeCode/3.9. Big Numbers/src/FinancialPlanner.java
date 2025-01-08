import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FinancialPlanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        BigDecimal principal = new BigDecimal(in.next());

        System.out.print("Enter annual interest rate (as %): ");
        BigDecimal rate = new BigDecimal(in.next()).divide(BigDecimal.valueOf(100));

        System.out.print("Enter number of years: ");
        int years = in.nextInt();

        BigDecimal amount = principal.multiply(BigDecimal.ONE.add(rate).pow(years).setScale
                (2, RoundingMode.HALF_UP));

        System.out.printf("Total amount after %d years: %s%n", years, amount);
        in.close();

    }
}
