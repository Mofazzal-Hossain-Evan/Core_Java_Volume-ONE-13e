package EmployeeManagementSystem;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo(){
        System.out.println("Developer: " + name + ", Salary: " + salary + ", Language: " + programmingLanguage);
    }

}
