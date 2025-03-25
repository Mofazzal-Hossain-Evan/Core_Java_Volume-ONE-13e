package UniversityStaffPayrollSystem;

public class Professor extends Staff{
    private double researchGrant;

    public Professor(String name, double salary, double researchGrant) {
        super(name, salary);
        this.researchGrant = researchGrant;
    }


}
