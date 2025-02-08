package EmployeeManagementSystem;

import java.sql.SQLOutput;

public class Employee {

    private int employeeID;
    private static int idCounter = 1;
    private String name;
    private double salary;
    private String department;


    public Employee(String name, double salary, String department) {
        this.employeeID = idCounter++;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void raiseSalary(double percent) {
        salary = salary * (percent / 100);
    }

    public void promoteEmployee(String newDepartment) {
        this.department = newDepartment;
    }

    public void displayInfo() {
        System.out.println(employeeID + name + salary + department);
    }



}
