package Employee_Role_Analyzer;

sealed class Employee permits Manager, Executive {
    private final double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}


final class Manager extends Employee {

    public Manager(double salary) {
        super(salary);
    }
}

final class Executive extends Employee {
    private final String title;

    public Executive(double salary, String title) {
        super(salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}