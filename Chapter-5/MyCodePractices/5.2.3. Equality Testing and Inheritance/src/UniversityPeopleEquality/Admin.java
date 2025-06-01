package UniversityPeopleEquality;

public class Admin extends Person{
    private String role;

    public Admin(String nationalId, String name, String role) {
        super(nationalId, name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
