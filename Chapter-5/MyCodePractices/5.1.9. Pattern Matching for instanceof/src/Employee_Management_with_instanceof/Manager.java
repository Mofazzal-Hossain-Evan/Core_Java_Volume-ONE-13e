package Employee_Management_with_instanceof;

public class Manager extends Employee{

  private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
