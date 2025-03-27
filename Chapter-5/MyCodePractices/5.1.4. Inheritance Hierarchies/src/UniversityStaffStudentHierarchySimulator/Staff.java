package UniversityStaffStudentHierarchySimulator;

public class Staff extends Person{
    protected int staffID;
    protected String department;
    protected String role;

    public Staff(String name, int age, String address, int staffID, String department, String role) {
        super(name, age, address);
        this.staffID = staffID;
        this.department = department;
        this.role = role;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Staff ID: " + staffID + ", Department: " + department + ", Role: " + role);
    }
}
