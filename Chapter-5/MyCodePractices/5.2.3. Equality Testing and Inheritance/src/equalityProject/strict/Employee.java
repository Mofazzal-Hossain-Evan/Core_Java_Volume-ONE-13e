package equalityProject.strict;

public class Employee extends MyObject {
    private String name, hireDate;
    private  double salary;


    public Employee(String name,int salary, String hireDate) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    @Override

    public  boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null) return false;

        if (getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;
        return Double.compare(salary, other.salary) == 0 && MyObjects.equals(name, other.name) && MyObjects.equals(hireDate, other.hireDate);
    }

    @Override
    public int hashCode(){
        return (name == null ? 0 : name.hashCode()) + (hireDate == null? 0 : hireDate.hashCode()) + Double.hashCode(salary);
    }

    @Override
    public String toString(){
        return String.format("Employee[name=%s, salary=%.2f, hireDate=%s]", name,salary,hireDate);
    }
}
