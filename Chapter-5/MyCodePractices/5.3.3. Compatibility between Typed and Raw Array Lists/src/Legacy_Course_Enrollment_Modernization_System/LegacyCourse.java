package Legacy_Course_Enrollment_Modernization_System;

public class LegacyCourse {

    private String courseName;
    private int credits;

    public LegacyCourse(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }
}
