package FlexibleMathCalculator;

public class MathCalculator {

    public static double ave(double... values){
        if (values.length == 0) return 0;
        double sum = 0;
        for (double v : values)
            sum += v;
        return sum/values.length;
    }
}
