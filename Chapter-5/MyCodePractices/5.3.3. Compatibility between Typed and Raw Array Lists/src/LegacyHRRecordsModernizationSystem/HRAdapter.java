package LegacyHRRecordsModernizationSystem;

import java.util.ArrayList;

public class HRAdapter {
    private LegacyHRDatabase legacyDB = new LegacyHRDatabase();

    // Safe method to add Employee records to legacy system (with typed list)
    public void safeAddRecord(ArrayList<Employee> employeeArrayList) {
        legacyDB.addRecord(employeeArrayList);
    }

    // Safe method to fetch Employee records (handling raw data from legacy)
    @SuppressWarnings("unchecked")
    public ArrayList<Employee> safeFetch(String dept) {
        ArrayList raw = legacyDB.fetchRecord(dept);
        ArrayList<Employee> typed = new ArrayList<>();

        // Check each element and cast safely
        for (Object o : raw) {
            if (o instanceof LegacyEmployee) {
                LegacyEmployee legacyEmp = (LegacyEmployee) o;
                typed.add(new Employee(legacyEmp.getName(), legacyEmp.getDepartment()));
            } else {
                System.out.println("Found corrupted entry, skipping: " + o);
            }
        }
        return typed;
    }
}
