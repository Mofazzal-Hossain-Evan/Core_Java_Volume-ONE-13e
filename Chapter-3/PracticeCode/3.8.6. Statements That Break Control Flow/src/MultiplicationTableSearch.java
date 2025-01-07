import java.util.Scanner;

public class MultiplicationTableSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to search in the multiplication table: ");
        int target = input.nextInt();

        boolean found = false;

        outerLoop:
        for(int i = 1; i <= 10; i++) {
            for (int j = 1; i<= 10; j++) {
                if(i * j == target) {
                    System.out.println("Found: " + i + " x " + j + " = " + target);
                    found = true;
                    break outerLoop;
                }
            }
        }
if(!found) {
    System.out.println("Number not found in the multiplication table.");
}
input.close();
    }
}
