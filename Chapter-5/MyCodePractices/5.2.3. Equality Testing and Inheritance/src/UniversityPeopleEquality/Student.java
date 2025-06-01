package UniversityPeopleEquality;

public class Student extends Person{
    private String major;

    public Student(String nationalId, String name, String major) {
        super(nationalId, name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

}
