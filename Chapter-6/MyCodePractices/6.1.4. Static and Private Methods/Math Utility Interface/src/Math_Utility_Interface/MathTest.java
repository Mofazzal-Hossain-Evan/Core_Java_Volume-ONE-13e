/* Package declaration to match directory structure */
package Math_Utility_Interface;

/* Test program to demonstrate MathUtils interface usage */
public class MathTest {
    public static void main(String[] args) {

        /* Using static methods directly from the interface */
        System.out.println("Factorial of 5: " + MathUtils.factorial(5));
        System.out.println("Fibonacci of 10: " + MathUtils.fibonacci(10));

        /* Using ScientificCalculator */
        ScientificCalculator sciCalc = new ScientificCalculator();
        System.out.println("2^8 = " + sciCalc.power(2, 8));

        /* Using StatisticalCalculator */
        StatisticalCalculator statCalc = new StatisticalCalculator();
        double[] data = {10, 20, 30, 40, 50};
        System.out.println("Mean: " + statCalc.mean(data));

        /* Testing validation (should throw exception) */
        try {
            MathUtils.factorial(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation works: " + e.getMessage());
        }
    }
}
