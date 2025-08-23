/* Package declaration to match directory structure */
package Math_Utility_Interface;

/* Class implementing MathUtils for statistical operations */
public class StatisticalCalculator implements MathUtils {

    /* Example method: mean of numbers */
    public double mean(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
