package calculators;

import core.Calculator;

public class ScientificCalculator extends Calculator {
    public ScientificCalculator() {}

    public void calculateSquareRoot(double a){
        try {
            executeOperation("sqrt", a);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
        displayResult();
    }
}
