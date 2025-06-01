package EmployeeParkingEligibilityChecker;

public class ParkingChecker {
    public static void main(String[] args) {
        Employee[] employees = {
                new Executive("CEO"),
                new Manager(2323),
                new Worker(3034),
                null
        };

        for (Employee e : employees){
            String parkingStatus = switch (e){
                case Executive ex ->  "✔ Free parking for Executive: " + ex.getTitle();
                case Manager m -> "✔ Reserved parking for Manager with bonus $" + m.getBonus();
                case Worker w -> "❌ No free parking. Salary is $" + w.getSalary();
                case null, default -> "🚫 No employee. No parking!";
            };

            System.out.println(parkingStatus);
        }
    }
}
