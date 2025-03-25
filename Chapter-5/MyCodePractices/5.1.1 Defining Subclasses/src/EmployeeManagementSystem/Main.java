package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, 50000);
        Manager mgr = new Manager("Alice Smith", 102, 70000, 5000);
        Admin admin = new Admin("Bob Admin", 100, 90000);

        emp1.displayInfo();
        System.out.println();

        mgr.displayInfo();
        mgr.approveLeave();
        System.out.println();

        admin.displayInfo();
        admin.addEmployee(emp1);
        admin.removeEmployee(101);
    }
}