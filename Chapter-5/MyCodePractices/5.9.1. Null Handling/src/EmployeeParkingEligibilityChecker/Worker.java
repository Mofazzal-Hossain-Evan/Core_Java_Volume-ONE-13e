package EmployeeParkingEligibilityChecker;

final class Worker implements Employee {
    private final double salary;

    public Worker(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
