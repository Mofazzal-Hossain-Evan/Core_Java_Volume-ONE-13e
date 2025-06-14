package EmployeeManagementSystem;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void displayInfo(){
        System.out.println("Manager: " + name + ", Salary: " + salary + ", Bonus: " + bonus);
    }
}
