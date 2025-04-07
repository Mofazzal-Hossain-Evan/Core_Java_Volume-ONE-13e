package equalityProject.flexible;

public class Employee extends MyObject {
    private String name, hireDate;
    private double salary;

    public Employee(String name,double salary, String hireDate ) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (!(otherObject instanceof  Employee other)) return false;

        return Double.compare(salary, other.salary)  == 0
        //== 0 মানে হলো — চেক করা হচ্ছে যে কোনো ভেরিয়েবল বা এক্সপ্রেশন-এর মান শূন্য কি না (zero)।
    && MyObjects.equals(name, other.name)
                && MyObjects.equals(hireDate, other.hireDate);

    }

    @Override
    public int hashCode(){
        return (name == null ? 0 : name.hashCode() ) + (hireDate == null? 0 : hireDate.hashCode()) + Double.hashCode(salary);
    }

    @Override
    public String toString(){
        return String.format("Employee[name=%s, salary=%.2f, hireDate=%s]",name, salary, hireDate);
    }
}
