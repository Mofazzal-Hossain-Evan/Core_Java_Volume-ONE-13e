package Legacy_Course_Enrollment_Modernization_System;

import VintageStudentRecordMigration.LegacyStudent;

import java.util.ArrayList;

public class LegacySystem {
    public ArrayList getLegacyCourseList(){

        ArrayList list = new ArrayList();
        list.add(new LegacyStudent("Math", 4));
        list.add(new LegacyCourse("Physics", 4));
        list.add("Corrupted Data");
        list.add(new LegacyCourse("Chemistry", 3));
return  list;
    }
}
