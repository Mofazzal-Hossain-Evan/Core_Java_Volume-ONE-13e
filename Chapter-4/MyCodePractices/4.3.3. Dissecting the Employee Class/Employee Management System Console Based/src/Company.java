import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public void displayEmployees(){
        for (Employee e : employees){
            System.out.println(e);
        }
    }

    public void raiseSalary(String name, double byPercent){
        for (Employee e : employees) {
            if (e.getName().equalsIgnoreCase(name)) {
                e.raiseSalary(byPercent);
                System.out.println("Salary update for" + name);
                return;
            }
        }
        System.out.println("Employee not found");
    }


}
