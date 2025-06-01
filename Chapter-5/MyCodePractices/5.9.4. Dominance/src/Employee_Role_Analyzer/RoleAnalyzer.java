package Employee_Role_Analyzer;

public class RoleAnalyzer {
    public static void main(String[] args) {

        Employee e1 = new Employee(344534);
        Employee e2 = new Manager(45345);
        Employee e3 = new Executive(34545, "CEO");

        System.out.println(describe(e1));
        System.out.println(describe(e2));
        System.out.println(describe(e3));

    }

    public static String describe(Employee e){
        return switch (e){
            case Executive exec -> "Executive: " + exec.getTitle();
            case Manager m -> "Manager: deserving a bonus";
           // case Employee emp -> "Employee: salary is " + emp.getSalary();
            case null, default -> "null";
        };
    }
}
