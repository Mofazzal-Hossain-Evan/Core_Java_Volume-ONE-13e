package CorporateHierarchy;

public class CorporateHierarchy {
    public static void main(String[] args) {

        Company company = new Company();

        Employee emp1 = new Employee("John Doe", 30, "123 Street, NY", 1001, 50000, "IT", 5);
        Manager mgr1 = new Manager("Alice Smith", 40, "456 Avenue, CA", 1002, 80000, "HR", 4, 10);
        Executive exec1 = new Executive("Robert Brown", 50, "789 Blvd, TX", 1003, 120000, "Finance", 5, 20, 5.5);
        Employee prog1 = new Employee("David Lee", 28, "567 Lane, FL", 1004, 70000, "IT", 5);
        Employee sec1 = new Employee("Emma White", 35, "890 Road, NV", 1005, 45000, "Admin", 3);

        company.addEmployee(emp1);
        company.addEmployee(mgr1);
        company.addEmployee(exec1);
        company.addEmployee(prog1);
        company.addEmployee(sec1);

        System.out.println("--- All Employees ---");
        company.displayAllEmployees();

        System.out.println("\n--- Promoting David Lee ---");
        company.promoteEmployee(1004);

        System.out.println("\n--- Updated Employees List ---");
        company.displayAllEmployees();

    }
}