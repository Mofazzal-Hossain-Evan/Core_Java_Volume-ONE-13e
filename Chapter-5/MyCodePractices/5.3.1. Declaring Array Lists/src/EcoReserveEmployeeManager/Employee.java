package EcoReserveEmployeeManager;

public class Employee {
    private String name;
    private int id;
    private String role, location;
    private double salary;

    public Employee(String name, int id, String role, String location, double salary) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.location = location;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", role='" + role + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
