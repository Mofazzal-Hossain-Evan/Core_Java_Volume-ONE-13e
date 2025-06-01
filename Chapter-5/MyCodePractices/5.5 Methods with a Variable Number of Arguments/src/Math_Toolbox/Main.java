package Math_Toolbox;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {4.5, 3.2, 9.8, 1.5, 7.0};

        System.out.println("Sum: " + MathToolbox.sum(numbers));
        System.out.println("Average: " + MathToolbox.average(numbers));
        System.out.println("Max: " + MathToolbox.max(numbers));
        System.out.println("Min: " + MathToolbox.min(numbers));

        // সরাসরি varargs দিয়ে
        System.out.println("Another Sum: " + MathToolbox.sum(1.1, 2.2, 3.3));

    }
}
