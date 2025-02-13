package EmployeeWorkAnniversaryTracker;

public class WorkAnniversaryTracker {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice Johnson", 50000, 2015, 2, 13);
        Employee emp2 = new Employee("Bob Smith", 60000, 2018, 7, 10);

        emp1.checkAnniversary();
        emp2.checkAnniversary();

        emp1.displayInfo();
        emp2.displayInfo();
    }
}
