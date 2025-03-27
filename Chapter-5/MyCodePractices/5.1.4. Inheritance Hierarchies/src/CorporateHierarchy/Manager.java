package CorporateHierarchy;

public class Manager extends Employee{
    protected int teamSize;

    public Manager(String name, int age, String address, int employeeID, double salary, String department, int performanceRating, int teamSize) {
        super(name, age, address, employeeID, salary, department, performanceRating);
        this.teamSize = teamSize;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}
