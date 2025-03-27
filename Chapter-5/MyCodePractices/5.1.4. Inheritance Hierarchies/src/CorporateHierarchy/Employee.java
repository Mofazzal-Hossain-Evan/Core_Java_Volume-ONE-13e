package CorporateHierarchy;

public class Employee extends Person{

    protected int employeeID;
    protected double salary;
    protected String department;
    protected int performanceRating;

    public Employee(String name, int age, String address, int employeeID, double salary, String department, int performanceRating) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
        this.performanceRating = performanceRating;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary + ", Department: " + department + ", Performance Rating: " + performanceRating);
    }

    public void applySalaryIncrement(){
        if (performanceRating >= 4) {
            salary *= 1.10;
            System.out.println(name + " received a salary increase! New Salary: " + salary);
        }
    }
}
