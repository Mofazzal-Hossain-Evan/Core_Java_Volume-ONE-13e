package Employee_Management_with_instanceof;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee [] staff = {
                new Employee("John Doe", 50000),
                new Manager("Alice Smith", 70000, 5000),
                new Executive("Bob Brown", 90000, "Chief Officer")
        };

        for (Employee e : staff) {
            if (e instanceof Manager boss) {
                boss.setBonus(1000);
                System.out.println("Bonus Updated for Manager!");
            } else if (e instanceof Executive exec && exec.getTitle().length() >= 10) {
                System.out.println("High Title Executive Found: " + exec.getTitle());
            }
            e.displayInfo(); //display update
        }


    }
}
