package MathConsole;
import java.util.function.BiFunction;

public class MathConsole {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Integer::sum;
        BiFunction<Double, Double, Double> power = Math::pow;

        System.out.println("Sum: " + adder.apply(5, 10));
        System.out.println("Power: " + power.apply(2.0, 3.0));
    }
}
