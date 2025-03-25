package EmployeeManagementSystem;

public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary(){
        return super.getSalary() + bonus;
    }

}
