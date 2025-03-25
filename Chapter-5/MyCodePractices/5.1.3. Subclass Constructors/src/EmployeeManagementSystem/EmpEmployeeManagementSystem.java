package EmployeeManagementSystem;

public class EmpEmployeeManagementSystem  {
    public static void main(String[] args) {

        Manager manager = new Manager("John Doe", 50000, 5000);
        Employee employee = new Employee("Jane Smith", 40000);

        System.out.println(manager.getName() + "'s salary: " + manager.getSalary());
        System.out.println(employee.getName() + "'s salary: " + employee.getSalary());
    }
}