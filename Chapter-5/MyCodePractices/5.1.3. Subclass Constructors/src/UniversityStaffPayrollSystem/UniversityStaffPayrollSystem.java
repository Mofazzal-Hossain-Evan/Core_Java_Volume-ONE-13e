package UniversityStaffPayrollSystem;

public class UniversityStaffPayrollSystem {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Albert", 60000, 10000);
        Staff staf = new Staff("Mr. nov", 300);

        System.out.println(professor.name + "'s salary: " + professor.getSalary());
        System.out.println(staf.name + "'s salary: " + staf.getSalary());
    }
}
