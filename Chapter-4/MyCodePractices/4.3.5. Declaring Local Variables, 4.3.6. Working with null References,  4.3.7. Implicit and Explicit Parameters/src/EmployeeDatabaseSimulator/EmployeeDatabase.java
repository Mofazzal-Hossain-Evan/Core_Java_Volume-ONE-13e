package EmployeeDatabaseSimulator;

public class EmployeeDatabase {
    public static void main(String[] args) {

        var emp1 = new Employee("Imran", 90000);
        var emp2 = new Employee("Bob", 4000);

        emp2.DisplayInfo();
        emp1.DisplayInfo();
    }
}
