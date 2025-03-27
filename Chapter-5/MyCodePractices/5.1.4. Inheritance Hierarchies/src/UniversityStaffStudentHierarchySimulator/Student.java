package UniversityStaffStudentHierarchySimulator;

public class Student extends Person{

    protected int studentID;
    protected String major;
    protected double GPA;

    public Student(String name, int age, String address, int studentID, String major, double GPA) {
        super(name, age, address);
        this.studentID = studentID;
        this.major = major;
        this.GPA = GPA;
    }

    public void displayInfo(){
        System.out.println("Student ID: " + studentID + ", Major: " + major + ", GPA: " + GPA);
    }

    public void applyScholarship(){
        if (GPA >= 3.5){
            System.out.println(name + " qualifies for a scholarship.");
        } else {
            System.out.println(name + " does not qualify for a scholarship.");
        }
    }
}
