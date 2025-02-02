package StudentGradeTracker;

public class StudentTracker {
    public static void main(String[] args) throws InterruptedException {

        Student[] students = new Student[3];

        students[0] = new Student("Alice", 101, 85.5);
        students[1] = new Student("Bob", 102, 90.0);
        students[2] = new Student("Charlie", 103, 78.3);

        for (Student s : students) {
            s.display();
        }
    }
}
