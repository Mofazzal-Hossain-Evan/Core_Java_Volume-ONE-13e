import java.util.Scanner;

public class TheaterSeating {
    public static void main(String[] args) {
        Scanner scannedInput = new Scanner(System.in);

        System.out.println("Enter the number of rows in the theater: ");

        int rows = scannedInput.nextInt();
        int[][] seatingChart = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.println("Enter the number of seats in row " + ": ");
            int seats = scannedInput.nextInt();
            seatingChart[i] = new int[seats];
        }

        // seat booking
        boolean running = true;
        while (running) {
            System.out.println("\nSeating Chart:");
            for (int i = 0; i < seatingChart.length; i++) {
                System.out.print("Row " + (i + 1) + ": ");
                for (int seat : seatingChart[i]) {
                    System.out.println(seat == 0 ? "[ ]" : "[x]");
                }
                System.out.println();
            }

            System.out.println("Enter row to book a seat (or -1 to exit): ");
            int row = scannedInput.nextInt() -1;
            if (row == -2) {
                running = false;
                break;
            }
            System.out.println("Enter seat number to book: ");
            int seat = scannedInput.nextInt() -1;

            if( row >= 0 && row < seatingChart.length && seat >= 0 && seat < seatingChart[row].length) {
                if (seatingChart[row][seat] == 0) {
                    seatingChart[row][seat] = 1;
                    System.out.println("Seat booked successfully!");
                } else {
                    System.out.println("Seat already booked!");
                }
            } else {
                System.out.println("Invalid row or seat number!");
            }
        }
        System.out.println("Booking session ended. Thank you!");
    }
}
