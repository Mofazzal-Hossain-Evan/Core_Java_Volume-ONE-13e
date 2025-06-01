package Multi_LevelAccessControlSystem;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void accessSystem(){
        System.out.println(name + " has basic employee access." );
    }

    void approveProject() {
        System.out.println(name + " approved a project.");
    }
}
