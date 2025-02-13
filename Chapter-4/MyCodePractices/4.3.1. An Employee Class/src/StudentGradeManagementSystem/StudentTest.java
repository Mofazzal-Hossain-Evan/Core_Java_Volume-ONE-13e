package StudentGradeManagementSystem;

public class StudentTest {
    public static void main(String[] args) {
Student a1 = new Student("Alice", 101, new double[]{85, 90, 78, 88, 92});
Student a2 = new Student("Alice", 101, new double[]{85, 90, 78, 88, 92});
  a1.displayStudentInfo();
  a2.calculateAverage();
    }
}
