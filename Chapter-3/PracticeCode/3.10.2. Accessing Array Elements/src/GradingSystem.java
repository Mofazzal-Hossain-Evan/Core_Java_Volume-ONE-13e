import java.util.Random;

public class GradingSystem {

    public static void main(String[] args) {

        int[] scores = new int[10];
        Random random = new Random();

        for (int i = 0; i< scores.length; i++) {
            scores[i] = random.nextInt(101);
        }

        for (int i = 0; i < scores.length; i++) {
            char grade;
            if (scores[i] >= 90) grade = 'A';
            else if (scores[i] >= 80) grade = 'B';
            else if (scores[i] >= 70) grade = 'C';
            else if (scores[i] >= 60) grade = 'D';
            else grade = 'F';

            System.out.println("Student " + (i + 1) + ": Score = " + scores[i] + ", Grade = " + grade);

        }
    }
}
