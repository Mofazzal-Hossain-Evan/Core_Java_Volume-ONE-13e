import java.time.LocalDate;

public class Employee {


    private String name;
    private double salary;
    private LocalDate  hireDSay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDSay = hireDSay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate GetHireDay() {
        return hireDSay;
    }

    public void raiseSalary(double byPercent){
        salary += salary * (byPercent / 100);
    }

    public String toString(){
        return "Employee{" +
                "name=" + name + '\'' +
                ", Salary=" + salary +
                ", hireDay" + hireDSay +
                '}';
    }
}
