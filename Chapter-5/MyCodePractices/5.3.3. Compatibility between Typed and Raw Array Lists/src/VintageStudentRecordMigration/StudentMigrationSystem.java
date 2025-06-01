package VintageStudentRecordMigration;

import java.util.ArrayList;

public class StudentMigrationSystem {
    public static void main(String[] args) {
        StudentRecordAdapter adapter = new StudentRecordAdapter();
        ArrayList<ModernStudent> students = adapter.fetchTypedRecord();


        System.out.println("\n✅ Migrated Student Records:");
        for (ModernStudent student : students) {
            System.out.println(student);
        }
    }
}
