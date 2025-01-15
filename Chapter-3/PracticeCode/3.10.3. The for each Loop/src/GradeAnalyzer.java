import java.util.Arrays;

public class GradeAnalyzer {

    public static void main(String[] args) {

        int[] grades = {85, 90, 78, 92, 88};

        int total = 0;
        int countAbove80 = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for( int grade : grades) {
            total += grade;
            if(grade > 80) countAbove80++;
            if(grade > max) max = grade;
            if(grade < min) min = grade;
        }
        double average = (double) total / grades.length;
        System.out.println("grades: " + Arrays.toString(grades));
        System.out.println("Average: " + average);
        System.out.println("heigst grades: " + max);
        System.out.println("lowest grade: " + min);


    }
}
