package StudentGradeManagementSystem;

public class Student {

    private int rollNumber;
    private String name;
    private double[] marks;

    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
    for (double mark : marks) {
        sum+= mark;
    }
    return sum / marks.length;
    }

    public String getGrade(){
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        if (avg >= 80) return "B";
        if (avg >= 70) return "C";
        if (avg >= 60) return "D";
        return "F";
    }

    public void displayStudentInfo(){
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Average: " + calculateAverage() + ", Grade: " + getGrade());
    }

}
