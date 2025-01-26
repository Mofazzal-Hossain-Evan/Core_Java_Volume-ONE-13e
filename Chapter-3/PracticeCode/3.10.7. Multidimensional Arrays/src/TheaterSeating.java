import java.util.Scanner;

public class TheaterSeating {
    public static void main(String[] args) {


        int rows = 5, seats = 10;
        int[][] seating = new int[rows][seats];
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Seating Chart (0 = Available, 1 = Reserved):");
            for (int [] row: seating) {
                for (int seat : row) {
                    System.out.print( seat +" ");
                }
                System.out.println();
            }

            //prompt for user

            System.out.println("Enter row (1-5) or -1 to exit: ");
            int row = input.nextInt() - 1;
            if (row == -2)
                break;;

            System.out.println("Enter seat (1-10): ");
            int seat = input.nextInt() - 1;

            if (seating[row][seat] == 0) {
                seating[row][seat] = 1;
                System.out.println("Seat reserved successfully!");
            } else  {
                System.out.println("Seat already reserved. Please choose another seat.");
            }

        }

    }
}
