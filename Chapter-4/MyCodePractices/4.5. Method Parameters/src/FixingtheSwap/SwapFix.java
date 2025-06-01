package FixingtheSwap;

public class SwapFix {
    public static void swap(EmployeeWrapper x, EmployeeWrapper y) {

        Employee temp = x.emp;
        x.emp = y.emp;
        y.emp = temp;
    }

    public static void main(String[] args) {


        EmployeeWrapper a = new EmployeeWrapper(new Employee("Alice"));
        EmployeeWrapper b = new EmployeeWrapper(new Employee("Bob"));

        System.out.println("Before swap: a = " + a.emp.name + ", b = " + b.emp.name);
        swap(a, b);
        System.out.println("After swap: a = " + a.emp.name + ", b = " + b.emp.name);
    }
}
