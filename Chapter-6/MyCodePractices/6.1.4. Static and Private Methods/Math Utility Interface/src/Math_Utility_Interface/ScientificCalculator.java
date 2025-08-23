/* Package declaration to match directory structure */
package Math_Utility_Interface;

/* Class implementing MathUtils and adding extra features */
public class ScientificCalculator implements MathUtils {

    /* Example method: power calculation */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
