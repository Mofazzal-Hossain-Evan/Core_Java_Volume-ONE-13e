package OfficeManagerLab;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee{name='%s', id=%d, salary=%.2f}".formatted(name, id , salary);
    }
}
