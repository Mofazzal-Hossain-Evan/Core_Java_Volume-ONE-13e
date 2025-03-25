package HospitalManagementSystem; // ✅ Ensure package matches

public class Doctor extends Person {  // ✅ Should now work
    private double salary;
    private double bonus;

    public Doctor(String name, int age, double salary, double bonus) {
        super(name, age);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary + bonus;
    }
}

