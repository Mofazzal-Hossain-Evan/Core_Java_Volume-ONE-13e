package Multi_LevelAccessControlSystem;

public class Admin extends Manager{

    public Admin(String name) {
        super(name);
    }

    @Override
    void accessSystem(){
        System.out.println(name + " has full admin access.");
    }

    void resetPassword(){
        System.out.println(name + " reset a user’s password.");
    }

    void createReport() {
        System.out.println(name + " created an administrative report.");
    }
}
