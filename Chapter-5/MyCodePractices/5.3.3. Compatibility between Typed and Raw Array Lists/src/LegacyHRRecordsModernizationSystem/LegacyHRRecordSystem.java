package LegacyHRRecordsModernizationSystem;

import java.util.ArrayList;

public class LegacyHRRecordSystem {
    public static void main(String[] args) {
        HRAdapter hrAdapter = new HRAdapter();

        // Creating Employee records for modern system
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Finance"));
        employees.add(new Employee("Bob", "IT"));

        // Adding records to legacy system (not type-safe)
        hrAdapter.safeAddRecord(employees);

        // Fetching records from legacy system and printing them
        ArrayList<Employee> fetchedEmployees = hrAdapter.safeFetch("HR");
        System.out.println("\nFetched Employee Records:");
        for (Employee emp : fetchedEmployees) {
            System.out.println(emp);
        }
    }
}

/*

@SuppressWarnings("unchecked")
public ArrayList<Employee> safeFetch(String dept) {
    ArrayList raw = legacyDB.fetchRecords(dept);
    ArrayList<Employee> typed = new ArrayList<>();

    for (Object obj : raw) {
        if (obj instanceof LegacyEmployee) {
            LegacyEmployee legacyEmp = (LegacyEmployee) obj;
            // ✅ Convert legacy to modern Employee
            Employee emp = new Employee(legacyEmp.getName(), legacyEmp.getDepartment());
            typed.add(emp);
        } else {
            System.out.println("Found corrupted entry, skipping: " + obj);
        }
    }
    return typed;
}


 */
