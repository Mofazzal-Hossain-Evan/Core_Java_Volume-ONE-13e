package equalityProject.strict;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int salary, String hireDate, double bonus) {
        super(name, salary, hireDate);
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        if (getClass() != otherObject.getClass()) return false;

        Manager other = (Manager) otherObject;
        return Double.compare(bonus, other.bonus) == 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Double.hashCode(bonus);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", bonus=%.2f", bonus);
    }
}

