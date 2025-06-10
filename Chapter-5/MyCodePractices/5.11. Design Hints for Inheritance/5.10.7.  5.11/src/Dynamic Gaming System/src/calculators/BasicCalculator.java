package calculators;

import core.Calculator;

public class BasicCalculator extends Calculator {
    public BasicCalculator() {}

    // ব্যাখ্যা: add দুটি সংখ্যা যোগ করে।
    public void add(double a, double b) {
        try {
            executeOperation("addExact", a, b); // Math.addExact-এর মাধ্যমে
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
        displayResult();
    }
}