package University_of_Weird_Majors;

public class Student extends Person{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "studies " + major + ", and dreams of becoming a " +
                (major.toLowerCase().contains("zombie") ? "zombie overlord." :
                        major.toLowerCase().contains("meme") ? "viral sensation." :
                                "legend in their field.");
        //condition ? value_if_true : value_if_false;
    }
}
