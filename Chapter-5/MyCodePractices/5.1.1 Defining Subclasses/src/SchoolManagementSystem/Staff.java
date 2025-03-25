package SchoolManagementSystem;

public class Staff extends Person{
    private String department;
    private String shift;

    public Staff(String name, int age, String department, String shift) {
        super(name, age);
        this.department = department;
        this.shift = shift;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Department: " + department + ", Shift: " + shift);
    }
}
