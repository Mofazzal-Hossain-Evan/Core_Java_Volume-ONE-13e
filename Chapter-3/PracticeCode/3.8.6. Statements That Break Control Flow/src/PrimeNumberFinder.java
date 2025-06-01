import java.util.Scanner;

public class PrimeNumberFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = input.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = input.nextInt();

        System.out.println("Prime numbers in the range:");

        outerLoop:
        for(int i= start; i<= end; i++) {
            if(i<= 1) continue ;

            for(int j = 2; j<= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    continue outerLoop;
                }
            }
            System.out.println(i);
        }
        input.close();
    }
}
