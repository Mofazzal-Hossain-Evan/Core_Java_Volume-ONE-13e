package CorporateHierarchy;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void promoteEmployee(int employeeID){
       for (Employee emp : employees) {
           if (emp.employeeID == employeeID) {
               if (emp instanceof Programmer) {
                   employees.remove(emp);
                   employees.add(new Manager(emp.name, emp.age, emp.address, emp.employeeID, emp.salary *1.2, emp.department, emp.performanceRating,5));
                   System.out.println(emp.name +" has been promoted to Manager!");
               } else if (emp instanceof Manager) {
                   employees.remove(emp);
                   employees.add(new Executive(emp.name, emp.age, emp.address, emp.employeeID, emp.salary * 1.3, emp.department, emp.performanceRating, ((Manager) emp).teamSize, 10.0));
                   //এই (Manager) emp অংশটিকে "Type Casting" বলে, যা একটি Employee অবজেক্টকে Manager টাইপে কনভার্ট করার জন্য ব্যবহৃত হয়।
                   System.out.println(emp.name + " has been promoted to Executive!");
               }
               return;
           }
       }
        System.out.println("Not found");
    }

    public void displayAllEmployees(){
        for (Employee emp : employees){
            emp.displayInfo();
            System.out.println("---------------------");
        }
    }
}
