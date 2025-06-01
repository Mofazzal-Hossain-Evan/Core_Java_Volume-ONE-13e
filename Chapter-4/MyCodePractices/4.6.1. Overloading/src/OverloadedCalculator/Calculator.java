package OverloadedCalculator;

public class Calculator {

    public int add(int a, int b){
        return a +b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public String add(String a , String b){
        return a + b;
    }

    // overloaded multiply

    public int multiply(int a, int b){
        return a* b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public String multiply(String a, int times){
        return a.repeat(times);
    }

    // Overloaded divide methods
    public int divide(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Cant !");
        }
        return a / b;
    }

    public double divide(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Cant!");
        }
        return a / b;
    }

    public double divide(int a, double b){
        if (b == 0){
            throw new ArithmeticException("Cant");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("Addition");
        System.out.println(calc.add(10,20));
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10.5, 20.3));
        System.out.println(calc.add(10, 20.5));
        System.out.println(calc.add("Hello, ", "World!"));

        System.out.println("\nMultiplication:");
        System.out.println(calc.multiply(5, 4));
        System.out.println(calc.multiply(5.2, 4.1));
        System.out.println(calc.multiply(3, 2.5));
        System.out.println(calc.multiply("Java", 3));

        System.out.println("\nDivision:");
        System.out.println(calc.divide(10, 2));
        System.out.println(calc.divide(10.5, 2.5));
        System.out.println(calc.divide(10, 2.5));
    }

}
