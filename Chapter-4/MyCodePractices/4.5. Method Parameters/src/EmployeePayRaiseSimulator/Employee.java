package EmployeePayRaiseSimulator;

public class Employee {
    double salary;

     Employee(double salary) {
        this.salary = salary;
    }

    void raiseSalary(double percent){
         salary += salary * (percent / 100);
    }


}
