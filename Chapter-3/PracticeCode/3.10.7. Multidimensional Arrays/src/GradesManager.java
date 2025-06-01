import java.util.Scanner;

public class GradesManager {
    public static void main(String[] args) {
        int students = 5, subjects = 3;
        double[][] grades = new double[students][subjects];
        Scanner scannedInput = new Scanner(System.in);

        //input grades
        for (int i= 0; i < students; i++) {
            System.out.printf("Enter grades for Student %d:%n", i + 1);
            for (int j =0; j<subjects; j++) {
                System.out.printf("Subject %d: ", j + 1);
                grades[i][j] = scannedInput.nextDouble();
            }
        }
        // calculate
        for(int i = 0; i < students; i++) {
            double sum = 0;
            for (int j = 0; j < subjects; j++) {
                sum += grades[i][j];
            }

            double average = sum / subjects;
            System.out.printf("Student %d average grade: %.2f%n", i + 1, average);
        }
    }


}
