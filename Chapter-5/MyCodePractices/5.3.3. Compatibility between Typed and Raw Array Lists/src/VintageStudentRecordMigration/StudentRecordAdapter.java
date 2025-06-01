package VintageStudentRecordMigration;

import java.util.ArrayList;

public class StudentRecordAdapter {
    private LegacyCollegeSystem legacySystem = new LegacyCollegeSystem();

    // ✅ টাইপড ArrayList<ModernStudent> ফিরিয়ে দেয়
    @SuppressWarnings("unchecked")

    public ArrayList<ModernStudent> fetchTypedRecord() {
        ArrayList rawList = legacySystem.getRawStudentRecords();
        ArrayList<ModernStudent> typedList = new ArrayList<>();

        // 🔁 প্রতিটা অবজেক্ট চেক করে টাইপ কনভার্সন
        for (Object o : rawList){
            if (o instanceof LegacyStudent){
                LegacyStudent ls = (LegacyStudent) o;
                ModernStudent ms = new ModernStudent(ls);
                typedList.add(ms);
            } else {
                System.out.println("Corrupted data skipped: " + o);
            }
        }
        return typedList;
    }
}
