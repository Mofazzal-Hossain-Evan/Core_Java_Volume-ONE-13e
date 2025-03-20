import EmployeeManagementSystem.Employee;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void approveLeave() {
        System.out.println(getName() + " has approved a leave request.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: $" + bonus);
    }
}

