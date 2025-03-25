package EmployeeManagementSystem;

public class Admin extends Employee {

    public Admin(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void addEmployee(Employee emp) {
        System.out.println("Admin added new employee: " + emp.getName());
    }

    public void removeEmployee(int empId){
        System.out.println("Employee with ID " + empId + " has been removed.");
    }
}
