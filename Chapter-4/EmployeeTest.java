import java.time.*;

/**
 * This program tests the Employee class.
 * @version 1.13 2018-04-10
 * @author Cay Horstmann
 */
public class EmployeeTest
{
    public static void main(String[] args)
    {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
                    + e.getHireDay());
    }
}

class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

/***
 * is there any virable by this name? "byPercent"
 *
 *
 * In the code you provided, there is no variable specifically named byPercent. Let's break this down:
 *
 * Parameter, not variable: In the raiseSalary method, byPercent is a parameter, not a variable in the traditional sense.
 * Parameters are similar to variables, but they're special in that they receive values when the method is called.
 * java
 *
 * Copy
 * public void raiseSalary(double byPercent)
 * Scope: The byPercent parameter is only in scope within the raiseSalary method. It doesn't exist outside of this method.
 * No field declaration: There's no field (class-level variable) declared with this name in the Employee class or anywhere else in the provided code.
 * Local usage: Inside the raiseSalary method, byPercent is used directly without being assigned to another variable:
 * java
 *
 * Copy
 * double raise = salary * byPercent / 100;
 * Method invocation: When the method is called in the main method:
 * java
 *
 * Copy
 * e.raiseSalary(5);
 * The value 5 is passed directly as an argument, which then becomes the value of byPercent within the method.
 * So, to directly answer your question: No, there isn't a variable named byPercent in this code.
 * It's a parameter name used in the method signature and within the method body of raiseSalary. It receives its value when the method is called,
 * but it's not a variable that exists outside of this method's scope.
 */