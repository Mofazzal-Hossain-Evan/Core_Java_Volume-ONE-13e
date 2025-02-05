package StudentManagerPro;

public class Student {
    private String name;
    private int id;
    private double grade;


    public Student(String name, int id, double grade) {
        this.grade = grade;
        this.id = id;
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public String string() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}
