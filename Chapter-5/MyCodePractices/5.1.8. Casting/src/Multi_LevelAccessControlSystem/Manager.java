package Multi_LevelAccessControlSystem;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    void accessSystem(){
        System.out.println(name +" has manager level access.");
    }

    void approveLeave(){
        System.out.println(name + " approved leave.");
    }
}
