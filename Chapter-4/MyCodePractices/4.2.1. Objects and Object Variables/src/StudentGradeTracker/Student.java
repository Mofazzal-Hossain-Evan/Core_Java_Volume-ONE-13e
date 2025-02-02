package StudentGradeTracker;

public class Student {
    String name;
    int rollNumber;
    double grade;

    public Student(String name, int rollNumber, double grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
public void display() {
    System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade);
}

}
