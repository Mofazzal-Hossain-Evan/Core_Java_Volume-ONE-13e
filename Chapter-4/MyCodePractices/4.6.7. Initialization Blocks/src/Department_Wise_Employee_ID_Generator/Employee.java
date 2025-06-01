package Department_Wise_Employee_ID_Generator;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private static Map<String, Integer> departmentIds = new HashMap<>();

    private int id;
    private String name;
    private double salary;
    private String department;

    static {
        departmentIds.put("HR", 100);
        departmentIds.put("IT", 200);
        departmentIds.put("Finance", 300);
    }

    // Constructor
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;

        if (departmentIds.containsKey(department)) {
            this.id = departmentIds.get(department);
            departmentIds.put(department, this.id + 1);
        } else {
            throw new IllegalArgumentException("Invalid Department: " + department);
        }
    }

    public void display() {
        System.out.println("Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + ", Department=" + department + "]");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000, "IT");
        emp1.display();

        Employee emp2 = new Employee("Bob", 60000, "HR");
        emp2.display();
    }
}
