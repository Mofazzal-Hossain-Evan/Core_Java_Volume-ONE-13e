package ObjectSwappingExperiment;

public class SwapTest {
    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;

        System.out.println("Inside method: x = " + x.name + ", y = " + y.name);
    }

    public static void main(String[] args) {
        Employee a = new Employee("Alice");
        Employee b = new Employee("Bob");

        System.out.println("Before swap: a = " + a.name + ", b = "+b.name);

        swap(a,b); // Will not swap references outside the method
        System.out.println("After swap: a = " + a.name + ", b = " + b.name );
    }
}
