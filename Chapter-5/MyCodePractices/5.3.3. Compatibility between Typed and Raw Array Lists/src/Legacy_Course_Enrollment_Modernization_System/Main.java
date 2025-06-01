package Legacy_Course_Enrollment_Modernization_System;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LegacySystem legacySystem = new LegacySystem();
        ArrayList rawList = legacySystem.getLegacyCourseList(); // 🟡 raw list

        ModernAdapter adapter = new ModernAdapter();
        ArrayList<ModernCourse> modernList = adapter.convertRawToModern(rawList);

        System.out.println("✅ Modern Course List:");
        for (ModernCourse course : modernList){
            System.out.println(course);
        }
    }
}
