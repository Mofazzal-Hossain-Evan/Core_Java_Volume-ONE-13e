package LegacyHRRecordsModernizationSystem;

public class LegacyEmployee {
    private String name, department;

    public LegacyEmployee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "LegacyEmployee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
