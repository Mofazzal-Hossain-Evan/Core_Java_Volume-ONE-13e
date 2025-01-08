import java.math.BigInteger;
import java.util.Scanner;

public class PrimeFactorizationTool {

    public static void man(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a large number to factorize: ");
        BigInteger number = new BigInteger(in.next());

        System.out.println("Prime factors:");
        BigInteger divisor = BigInteger.valueOf(2);

        while(number.compareTo(BigInteger.ONE) > 0) {
            while (number.mod(divisor).equals(BigInteger.ZERO)) {
                System.out.println(divisor);
                number = number.divide(divisor);
            }
            divisor = divisor.add(BigInteger.ONE);
        }
in.close();
    }
}
