package BuggyEmployeewithoutequals_hashCode.ProperEmployeewithequals_hashCode;

import java.util.Objects;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Employee other)) return false;
        return id == other.id && Objects.equals(name, other.name);
    }

    public int hashCode(){
        return Objects.hash(name, id);
    }
}
