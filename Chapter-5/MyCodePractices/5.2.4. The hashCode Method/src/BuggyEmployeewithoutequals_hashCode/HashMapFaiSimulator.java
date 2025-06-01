package BuggyEmployeewithoutequals_hashCode;

import java.sql.SQLOutput;
import java.util.HashMap;

public class HashMapFaiSimulator {
    public static void main(String[] args) {


        HashMap<Employee, String> map = new HashMap<>();

        Employee e1 = new Employee("Name1", 34);
        Employee e2 = new Employee("Name3", 212);

        map.put(e1, "Software Eng");

        System.out.println(" e1 == e2: " + (e1 == e2));
        System.out.println(" e1.equals(e2): " + e1.equals(e2));
        System.out.println(" map contains e2 key: " + map.containsKey(e2));
        System.out.println(" map.get(e2): " + map.get(e2));
    }
}
