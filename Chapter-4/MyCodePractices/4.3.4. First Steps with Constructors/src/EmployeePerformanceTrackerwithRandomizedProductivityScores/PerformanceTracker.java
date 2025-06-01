package EmployeePerformanceTrackerwithRandomizedProductivityScores;

public class PerformanceTracker {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice Johnson", 50000);
        Employee emp2 = new Employee("Bob Smith", 60000);
        Employee emp3 = new Employee("Charlie Brown", 55000);

        emp1.checkPerformanceBonus();
        emp2.checkPerformanceBonus();
        emp3.checkPerformanceBonus();

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}
