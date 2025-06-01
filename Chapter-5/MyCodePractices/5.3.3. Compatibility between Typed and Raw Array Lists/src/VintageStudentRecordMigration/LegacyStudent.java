package VintageStudentRecordMigration;

public class LegacyStudent {
    private String name;
    private int roll;

    public LegacyStudent(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "LegacyStudent{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}
