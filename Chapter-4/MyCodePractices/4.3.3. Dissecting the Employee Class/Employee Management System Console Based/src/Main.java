import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Company company = new Company();

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            //consume new line

            if (choice == 1){
                System.out.println("Enter Name: ");
                String Name = scanner.nextLine();
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Enter hire year: ");
                int year = scanner.nextInt();
                System.out.print("Enter hire month: ");
                int month = scanner.nextInt();
                System.out.print("Enter hire day: ");
                int day = scanner.nextInt();
                company.addEmployee(new Employee(Name, salary, year, month, day));
            } else if(choice == 2) {
                company.displayEmployees();
            } else if (choice == 3) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter raise percentage: ");
            double percent = scanner.nextDouble();
            company.raiseSalary(name, percent);
            } else if (choice == 4) {
                break;
            }
        }
        scanner.close();
    }
}
