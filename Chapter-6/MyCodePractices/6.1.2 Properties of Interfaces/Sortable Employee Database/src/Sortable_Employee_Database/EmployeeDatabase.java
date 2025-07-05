import java.util.Comparator;
import java.util.List;

public class EmployeeDatabase {

    public static void main(String[] args) {
        java.util.List<Employee> employees = new java.util.ArrayList<>();

        employees.add(new Employee("Alice Smith", 50000, "HR"));
        employees.add(new Employee("Bob Johnson", 60000, "IT"));
        employees.add(new Employee("Charlie Brown", 50000, "Finance"));
        employees.add(new Employee("Diana Prince", 75000, "IT"));

        System.out.println("Checking if objects are Comparable:");
        for (Object emp : employees){
            if (emp instanceof Comparator<?>){
                System.out.println(emp + " is Comparable");
            } else {
                System.out.println(emp + " is not Comparable");
            }
        }

        System.out.println("\nEmployees before sorting:");
        for (Employee emp : employees){
            System.out.println(emp);
        }

        java.util.Collections.sort(employees);
        System.out.println("\nEmployees after sorting (by salary, then name):");
        for (Employee emp : employees){
            System.out.println(emp);
        }

        System.out.println("\nCloning demonstration:");
        try {
            Employee original = employees.get(0);
            Employee cloned = (Employee) original.clone();
            /* Print original and cloned employee */
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);

            /* Modify the cloned employee */
            cloned.setSalary(55000); // Change salary of clone
            cloned.setDepartment("Marketing"); // Change department of clone

            /* Verify that original remains unchanged */
            System.out.println("\nAfter modifying clone:");
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);

        } catch (CloneNotSupportedException e){
            System.out.println("Cloning failed: " + e.getMessage());
        }
    }
}
