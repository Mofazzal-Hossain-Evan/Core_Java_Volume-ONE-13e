package EmployeeIDGenerator_DepartmentAssignment;

public class EmployeeIDSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice Johnson", 50000);
        Employee emp2 = new Employee("Brian Carter", 60000);
        Employee emp3 = new Employee("Olivia Brown", 75000);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}
