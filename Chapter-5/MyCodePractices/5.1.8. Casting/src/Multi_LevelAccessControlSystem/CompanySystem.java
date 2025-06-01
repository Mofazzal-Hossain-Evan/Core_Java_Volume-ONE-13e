package Multi_LevelAccessControlSystem;

public class CompanySystem {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Manager("bobo");
        Employee emp3 = new Admin("Boss");

        emp1.accessSystem();
        emp2.accessSystem();
        emp3.accessSystem();

        if (emp2 instanceof Manager){
            Manager mgr = (Manager) emp2;
            mgr.approveLeave();
            mgr.approveProject(); // Multi_LevelAccessControlSystem.Manager-specific method

        }

        if (emp3 instanceof Admin){
            Admin adm = (Admin) emp3;
            adm.resetPassword();
            adm.createReport();   // Multi_LevelAccessControlSystem.Admin-specific method

        }

    }
}
