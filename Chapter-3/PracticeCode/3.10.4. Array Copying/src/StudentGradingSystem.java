import java.util.Arrays;

public class StudentGradingSystem {
    
    public static void main(String[] args) {
        int[] grades = new int[3];
        String[] students = new String[3];
        
        int size = 0;
        
        String[] studentName = {"John", "Alice", "Bob", "Eve", "Charlie"};
        int[] studentGrades = {85, 90, 70, 95, 80};

        for (int i = 0; i < studentName.length; i++) {
            if (size == students.length) {
                students = Arrays.copyOf(students, students.length * 2);
                grades = Arrays.copyOf(grades, grades.length * 2);
            }
            students[size] = studentName[i];
            grades[size] = studentGrades[i];
            size++;
        }
        System.out.println("Students: " + Arrays.toString(Arrays.copyOf(students, size)));
        System.out.println("Grades: " + Arrays.toString(Arrays.copyOf(grades, size)));
        
        
    }
    
}
