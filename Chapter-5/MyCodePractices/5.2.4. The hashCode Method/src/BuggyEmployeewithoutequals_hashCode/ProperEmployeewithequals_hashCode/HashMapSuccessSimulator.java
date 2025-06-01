package BuggyEmployeewithoutequals_hashCode.ProperEmployeewithequals_hashCode;

import java.util.HashMap;

public class HashMapSuccessSimulator {

    public static void main(String[] args) {

        HashMap<Employee , String> map = new HashMap<>();

        Employee e1 = new Employee("Rahim", 101);
        Employee e2 = new Employee("Rahim", 101); // একই data, আলাদা object

        map.put(e1, "Software Engineer");

        System.out.println("e1 == e2: " + (e1 == e2));           // false
        System.out.println("e1.equals(e2): " + e1.equals(e2));   // true
        System.out.println("map contains e2 key: " + map.containsKey(e2)); // true
        System.out.println("map.get(e2): " + map.get(e2));       // Software Engineer
    }
}
