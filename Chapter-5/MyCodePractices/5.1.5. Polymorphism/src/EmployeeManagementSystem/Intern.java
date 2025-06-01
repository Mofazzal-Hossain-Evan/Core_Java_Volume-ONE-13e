package EmployeeManagementSystem;

public class Intern extends Employee {
    private int duration;

    public Intern(String name, double salary, int duration) {
        super(name, salary);
        this.duration = duration;
    }

    @Override
    public void displayInfo(){
        System.out.println("Intern: " + name + ", Salary: " + salary + ", Duration: " + duration + " months");
    }
}
