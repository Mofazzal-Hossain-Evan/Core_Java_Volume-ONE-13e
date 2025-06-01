package BuggyEmployeewithoutequals_hashCode;

public class Employee {
    private String name;
    private int Id;

    public Employee(String name, int id) {
        this.name = name;
        Id = id;
    }

    // কোনো equals() বা hashCode() override করা হয়নি
}
