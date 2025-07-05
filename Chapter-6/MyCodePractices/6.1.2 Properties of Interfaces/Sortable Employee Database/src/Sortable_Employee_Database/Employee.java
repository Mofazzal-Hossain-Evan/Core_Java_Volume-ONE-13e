public class Employee implements Comparable<Employee> ,Cloneable{
    private String name; // Employee's name
    private double salary; // Employee's salary
    private String department; // Employee's department

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Employee other) {
        /* Compare salaries first */
        if (this.salary != other.salary) {
            return Double.compare(this.salary, other.salary); // Sort by salary ascending
        }
        /* If salaries are equal, sort by name alphabetically */
        return this.name.compareTo(other.name); // Sort by name ascending
    }

    protected Object clone() throws CloneNotSupportedException{
        Employee cloned = (Employee) super.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
