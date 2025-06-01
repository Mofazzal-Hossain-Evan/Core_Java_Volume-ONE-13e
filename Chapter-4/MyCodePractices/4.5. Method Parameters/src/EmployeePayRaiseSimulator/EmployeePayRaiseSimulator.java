package EmployeePayRaiseSimulator;

import java.sql.SQLOutput;

public class EmployeePayRaiseSimulator {

    public static void increaseSalary(Employee emp, double percent){
        emp.raiseSalary(percent);
        System.out.println("Inside method: salary = " + emp.salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(4000);

        System.out.println("Before method call: salary = " + e1.salary);
        increaseSalary(e1, 10);
        System.out.println("After method call: salary = " + e1.salary);
    }
}
