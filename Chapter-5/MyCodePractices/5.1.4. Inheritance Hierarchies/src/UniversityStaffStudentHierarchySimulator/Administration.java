package UniversityStaffStudentHierarchySimulator;

public class Administration  extends Staff{
    private String adminRole;


    public Administration(String name, int age, String address, int staffID, String department, String role) {
        super(name, age, address, staffID, department, role);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Admin Role: " + adminRole);
    }

    public void changeAdminRole(String newRole){
        adminRole = newRole;
        System.out.println(name + " has been assigned the new admin role: " + adminRole);
    }
}
