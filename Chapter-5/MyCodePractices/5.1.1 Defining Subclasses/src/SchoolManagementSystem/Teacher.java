package SchoolManagementSystem;

public class Teacher extends Person{

    private String subject;
    private double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Teaches: " + subject + ", Salary: $" + salary);
    }
}
