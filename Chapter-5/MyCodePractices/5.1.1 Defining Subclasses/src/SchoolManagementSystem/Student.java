package SchoolManagementSystem;

public class Student extends Person {
    private String grade;
    private String[] subjects;

    public Student(String name, int age, String grade, String[] subjects) {
        super(name, age); // Call the superclass constructor
        this.grade = grade;
        this.subjects = subjects;
    }

    public void displayInfo(){
        super.displayInfo(); // Call Person's displayInfo()
        System.out.println("Grade: " + grade + ", Subjects: ");
        for (String subject : subjects) {
            System.out.println(subject + " ");
        }
        System.out.println();
    }
}
