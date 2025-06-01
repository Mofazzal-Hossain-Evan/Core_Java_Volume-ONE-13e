package SmartComparisonEngine;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private String name;
    private int id;
    private LocalDate hireDate;
    private String[] skills;

    public Employee(String name, int id, LocalDate hireDate, String[] skills) {
        this.name = name;
        this.id = id;
        this.hireDate = hireDate;
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Employee other)) return false;

        return id == other.id &&
                Objects.equals(name, other.name) &&
                Objects.equals(hireDate, other.hireDate) &&
                Arrays.equals(skills, other.skills);
    }

    @Override
    public int hashCode(){
        return  Objects.hash(name, id, hireDate) + Arrays.hashCode(skills);
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", hireDate=" + hireDate +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
