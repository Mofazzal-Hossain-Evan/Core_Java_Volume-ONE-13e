import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean restart = true;


        while(restart) {
            System.out.print("Enter the marks (0-100): \n");

            int marks = input.nextInt();

            String grade = (marks >= 90) ? "a" :
                    (marks >= 80) ? "b" :
                            (marks >= 70) ? "C" : "D";

            System.out.println("The grade is: " + grade);

            System.out.print("Do you want to restart? (yes/no): ");
            String response = input.next().toLowerCase();

            if(response.equals("no")) {
                restart = false;
            }
        }
        input.close();


    }
}
