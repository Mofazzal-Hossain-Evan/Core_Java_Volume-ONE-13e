import java.util.Arrays;

public class LotteryValidator {

    public static void main(String[] args) {

        int[] winningNumbers = {5, 18, 27, 35, 42};
                int[] ticket = {8, 9, 27, 36, 42};

                int matchCount = 0;

                for (int ticketNum : ticket) {
                    for (int winingNum : winningNumbers) {
                        if (ticketNum == winingNum) {
                            System.out.println("Match found: " + ticketNum);
                            matchCount++;
                        }
                    }
                }

        System.out.println("Total matches: " + matchCount);
                if (matchCount >= 3) {
                    System.out.println("Congratulations! Your ticket is a winner!");
                } else {
                    System.out.println("Sorry, better luck next time.");
                }



    }
}
