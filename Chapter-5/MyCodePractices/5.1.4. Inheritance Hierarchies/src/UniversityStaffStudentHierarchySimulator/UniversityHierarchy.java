package UniversityStaffStudentHierarchySimulator;

public class UniversityHierarchy {
    public static void main(String[] args) {
        University university = new University();

        // Adding Students
        Student student1 = new Student("John Doe", 20, "123 Street, NY", 2001, "Computer Science", 3.8);
        Student student2 = new Student("Jane Smith", 22, "456 Avenue, CA", 2002, "Mathematics", 3.2);

        // Adding Faculty
        Faculty faculty1 = new Faculty("Dr. Alice Green", 45, "789 Blvd, TX", 3001, "Computer Science", "Teaching", "Assistant Professor");
        Faculty faculty2 = new Faculty("Dr. Bob White", 50, "101 Road, FL", 3002, "Mathematics", "Teaching", "Professor");

        // Adding Administrator
        Administrator admin1 = new Administrator("Dr. David Black", 48, "202 Lane, NV", 4001, "Administration", "Management", "Dean");
        Administrator admin2 = new Administrator("Ms. Emma Brown", 40, "303 Drive, NY", 4002, "Administration", "Management", "Registrar");

        // Add them to the university
        university.addPerson(student1);
        university.addPerson(student2);
        university.addPerson(faculty1);
        university.addPerson(faculty2);
        university.addPerson(admin1);
        university.addPerson(admin2);

        // Displaying All People
        System.out.println("--- All People in University ---");
        university.displayAllPeople();

        // Scholarship Application
        System.out.println("\n--- Applying Scholarship for Student 2001 ---");
        university.applyScholarship(2001);

        // Promoting Faculty
        System.out.println("\n--- Promoting Faculty 3001 ---");
        university.promoteFaculty(3001);

        // Changing Admin Role
        System.out.println("\n--- Changing Admin Role for 4001 ---");
        university.changeAdminRole(4001, "Vice Chancellor");

        // Displaying Updated Information
        System.out.println("\n--- Updated People Information ---");
        university.displayAllPeople();
    }

}
