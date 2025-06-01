package UniversityPeopleEquality;

public class Professor extends Person{
    private String department;

    public Professor(String nationalId, String name, String department) {
        super(nationalId, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
