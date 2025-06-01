package BattleshipGameSimulator;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Alice", 70000, "HR"));
        staff.add(new Employee("Alice", 70000, "HR"));
        staff.add(new Employee("Alice", 70000, "HR"));

        for (Employee e: staff) {
            e.raiseSalary(5);
            e.displayInfo();
        }

        System.out.println("\nPromoting Bob to Manager...");
        staff.get(1).promoteEmployee("Management..");
        staff.get(1).displayInfo();

    }
}
