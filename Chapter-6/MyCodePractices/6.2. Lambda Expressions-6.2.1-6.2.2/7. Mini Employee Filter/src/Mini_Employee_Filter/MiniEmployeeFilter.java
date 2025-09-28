package Mini_Employee_Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiniEmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 60000),
                new Employee("Bob", 45000),
                new Employee("Annie", 52000),
                new Employee("Charlie", 48000)
        );

        // Predicate Lambda + Stream filter
        List<Employee> filtered = employees.stream()
                .filter(e -> e.getSalary() > 50000 && e.getName().startsWith("A"))
                .collect(Collectors.toList());

        filtered.forEach(System.out::println); // Consumer Lambda
    }
}