package UniversityStaffStudentHierarchySimulator;

public class Faculty extends Staff {
    protected String position;

    public Faculty(String name, int age, String address, int staffID, String department, String role, String position) {
        super(name, age, address, staffID, department, role);
        this.position = position;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + position);
    }

    public void promoteFaculty() {
        if (position.equalsIgnoreCase("Assistance Professor")) {
            position = "Associate Professor";
        } else {
            position.equals("Associate Professor");
            position = "Professor";
        }
        System.out.println(name + " has been promoted to " + position + ".");
    }


}
