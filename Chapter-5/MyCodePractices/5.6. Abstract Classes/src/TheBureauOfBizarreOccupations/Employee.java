package TheBureauOfBizarreOccupations;

abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getJobDescription();

}
