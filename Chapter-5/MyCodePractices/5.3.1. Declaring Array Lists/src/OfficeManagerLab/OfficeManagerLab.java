package OfficeManagerLab;

import java.util.ArrayList;
import java.util.Arrays;

public class OfficeManagerLab {
    public static void main(String[] args) {

        ArrayList<Employee> staff1 = new ArrayList<Employee>();

        // ✅ Full declaration with generic type
        staff1.add(new Employee("Man", 10, 565645));
        staff1.add(new Employee("MAn2", 323, 456456));

        // ✅ Diamond syntax (Java 7+)

        ArrayList<Employee> staff2 = new ArrayList<>();
        staff2.add(new Employee("man2", 323,43423));


        // ✅ Using var (Java 10+)
        var staff3 = new ArrayList<String>();
        //var staff3 = new ArrayList<Employee>(); error
        staff3.add("Not an employee");

        // ❌ Using var + diamond (becomes ArrayList<Object>)
        var staff4 = new ArrayList<>();
        staff4.add("not an employee");

        // ❌ Raw type (pre-Java 5)
        ArrayList rawList = new ArrayList(); //// No type safety
        rawList.add(new Employee("Edward", 323,4343));
        rawList.add("This is a String"); //// Allowed, but dangerous!

        // ✅ Using ensureCapacity before adding more employees
        staff1.ensureCapacity(100);
        for (int i = 0; i < 50; i++){
            staff1.add(new Employee("temp"+i, 200+i, 300+i));
        }

// ✅ trimToSize usage
        System.out.println("Before trim, staff1: " + staff1.size());
        staff1.trimToSize();

        // ✅ size() to get number of employees
        System.out.println("Total staff1 members: " + staff1.size());

        // ✅ Iterating over list
        for (Employee e : staff1){
            System.out.println(e);
        }

        // ⚠️ Try this: Uncomment below to see ClassCastException
       // Employee emp = (Employee) staff4.get(0); // Boom!

        // Summary
        System.out.println("✅ Demo completed.");
    }
}
