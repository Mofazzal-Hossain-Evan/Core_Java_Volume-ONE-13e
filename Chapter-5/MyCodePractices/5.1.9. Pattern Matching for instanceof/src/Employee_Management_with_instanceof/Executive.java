package Employee_Management_with_instanceof;

public class Executive extends Employee{
    private String title;

    public Executive(String name, double salary, String title) {
        super(name, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void displayInfo() {
        System.out.println("Executive: " + name + ", Title: " + title + ", Salary: " + salary);
    }
}
