package Legacy_Course_Enrollment_Modernization_System;

// 🔹 Modern version of the course with better formatting
public class ModernCourse {
    private String name;
    private int credit;

    public ModernCourse(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "ModernCourse{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                '}';
    }
}
