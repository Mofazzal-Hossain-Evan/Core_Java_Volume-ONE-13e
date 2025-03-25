package SchoolManagementSystem;

public class Main {

    public static void main(String[] args) {
        String[] subjects = {"Math", "Science", "English"};

        Student student1 = new Student("Alice", 15, "10th Grade", subjects);

        // Create Teacher
        Teacher teacher1 = new Teacher("Mr. Smith", 40, "Mathematics", 50000);

        // Create Staff
        Staff staff1 = new Staff("John Doe", 35, "Administration", "Morning");

        // Display Info
        System.out.println("---- Student Info ----");
        student1.displayInfo();

        System.out.println("\n---- Teacher Info ----");
        teacher1.displayInfo();

        System.out.println("\n---- Staff Info ----");
        staff1.displayInfo();
    }
}
