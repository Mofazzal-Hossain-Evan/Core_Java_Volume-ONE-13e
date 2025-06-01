package SmartComparisonEngine;

import java.time.LocalDate;
import SmartComparisonEngine.Employee;
import SmartComparisonEngine.DeepComparer;

public class Main {
    public static void main(String[] args) {

        // 🎯 Comparing simple arrays
        String[] skills1 = {"Java", "Spring"};
        String[] skills2 = {"Java", "Spring"};

        DeepComparer.compareObjects(skills1, skills2);

        // 🎯 Comparing 2D arrays
        String[][] nested1 = {{"Alice", "Bob"}, {"Charlie"}};
        String[][] nested2 = {{"Alice", "Bob"}, {"Charlie"}};

        DeepComparer.compareObjects(nested1, nested2);

        // 🎯 Comparing Employee objects
        Employee emp1 = new Employee("Alice", 101, LocalDate.of(2022, 5, 1), skills1);
        Employee emp2 = new Employee("Alice", 101, LocalDate.of(2022, 5, 1), skills2);
        Employee emp3 = new Employee("Bob", 102, LocalDate.of(2023, 1, 10), new String[]{"Python"});

        DeepComparer.compareObjects(emp1, emp2); // should match
        DeepComparer.compareObjects(emp1, emp3); // should not match
    }
}
