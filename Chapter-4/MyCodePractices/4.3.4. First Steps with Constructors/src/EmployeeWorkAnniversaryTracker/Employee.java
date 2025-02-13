package EmployeeWorkAnniversaryTracker;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary,int year, int month, int day ) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public int getYearsWorked(){
        return (int) ChronoUnit.YEARS.between(hireDay, LocalDate.now());
    }


    public void raiseSalary(double byPercent){
        salary += salary* byPercent / 100;
    }

    public void checkAnniversary(){
        LocalDate today = LocalDate.now();
        if (hireDay.getMonth() == today.getMonth() && hireDay.getDayOfMonth() ==
                today.getDayOfMonth()) {
            System.out.println(" " + name + " has a work anniversary today! 🎉");
            raiseSalary(5);
        }
    }
    public void displayInfo(){
        System.out.println(name + " | Salary: $" + salary + " | Hire Date: " + hireDay + " | Years Worked: " + getYearsWorked());
    }
}
