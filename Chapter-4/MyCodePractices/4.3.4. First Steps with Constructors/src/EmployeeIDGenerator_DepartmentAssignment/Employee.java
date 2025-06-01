package EmployeeIDGenerator_DepartmentAssignment;

class Employee {
private static int idCounter = 100;
private String name;
private double salary;
private  String department;
private int employeeID;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = assignDepartment();
        this.employeeID = generateID();
    }

    private int generateID(){
        return idCounter++;
    }
private String assignDepartment(){
        char firstLetter = Character.toUpperCase(name.charAt(0));
        if (firstLetter >= 'A' && firstLetter <= 'G') return "HR";
        if (firstLetter >= 'H' && firstLetter <= 'N') return "IT";
        return "Finance";
}

public void raiseSalary(double byPercent){
        salary += salary * byPercent / 100;
}

public void displayInfo(){
    System.out.println("ID: " + employeeID + " | Name: " + name + " | Salary: $" + salary + " | Department: " + department);

}

}