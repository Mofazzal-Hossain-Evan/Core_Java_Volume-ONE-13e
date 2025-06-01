package VintageStudentRecordMigration;

class ModernStudent  {
   private LegacyStudent legacyStudent;

    public ModernStudent(LegacyStudent legacyStudent) {

        this.legacyStudent = legacyStudent;
    }

    @Override
    public String toString() {
        return "Student{name='" +legacyStudent. getName() + "', roll=" + legacyStudent.getRoll() + "}";
    }
}
