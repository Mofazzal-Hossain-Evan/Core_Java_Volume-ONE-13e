import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {

        Scanner scannedInput = new Scanner(System.in);

        //step 1

        System.out.println("Enter the number of students: ");
        int numStudents = scannedInput.nextInt();

        //2
        double[][] grades = new double[numStudents][];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the number of assignments for student " + (i + 1) + ": ");
            int numAssignments = scannedInput.nextInt();
            grades[i] = new double[numAssignments];
            }
        //s3
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println("Assignment "+ (j + 1) + ": ");
                grades[i][j] = scannedInput.nextDouble();
            }
        }
//s4
        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (double grade : grades[i]) {
                sum += grade;
            }
            double average = grades[i].length > 0 ? sum / grades[i].length : 0;
            System.out.println("Student " + (i + 1) + " average grades: " + average );
        }

    }
}
