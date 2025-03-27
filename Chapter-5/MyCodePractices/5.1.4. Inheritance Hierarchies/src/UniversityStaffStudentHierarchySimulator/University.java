package UniversityStaffStudentHierarchySimulator;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void displayAllPeople() {
        for (Person person : people) {
            person.displayInfo();
            System.out.println("---------------------------------");
        }
    }

    public void promoteFaculty(int staffID) {
        for (Person person : people) {
            if (person instanceof Faculty && ((Faculty) person).staffID == staffID) {
                ((Faculty) person).promoteFaculty();
                return;
            }
        }
        System.out.println("Faculty member not found.");
    }

    public void applyScholarship(int studentID) {
        for (Person person : people) {
            if (person instanceof Student && ((Student) person).studentID == studentID) {
                ((Student) person).applyScholarship();
                return;
            }
        }
        System.out.println("Student not found.");

    }

    public void changeAdminRole(int staffID, String newRole) {
        for (Person person : people) {
            if (person instanceof Administrator && ((Administrator) person).staffID == staffID) {
                ((Administrator) person).changeAdminRole(newRole);
                return;
            }
        }
        System.out.println("Administrator not found.");
    }
}
