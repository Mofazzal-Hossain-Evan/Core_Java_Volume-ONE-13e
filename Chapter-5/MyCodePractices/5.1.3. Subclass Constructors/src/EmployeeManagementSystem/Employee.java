package EmployeeManagementSystem;

public class Employee {
protected String name;
protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

}
