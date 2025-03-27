package CorporateHierarchy;

// Programmer class extending Employee
class Programmer extends Employee {
    public Programmer(String name, int age, String address, int employeeID, double salary, String department, int performanceRating) {
        super(name, age, address, employeeID, salary, department, performanceRating);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Programmer");
    }
}

