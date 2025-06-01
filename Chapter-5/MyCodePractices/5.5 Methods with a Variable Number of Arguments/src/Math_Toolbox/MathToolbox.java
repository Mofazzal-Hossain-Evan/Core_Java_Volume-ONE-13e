package Math_Toolbox;

public class MathToolbox {

    public static double sum(double... values){
        double total = 0;
        for (double v : values) {
            total += v;
        }
        return total;
    }

    // Average of values
    public static  double average(double... values){
        if (values.length == 0) return 0;
        return sum(values) / values.length;
    }
    //maximum
    public static double max(double... values){
        if (values.length == 0) return Double.NEGATIVE_INFINITY;
        double max = values[0];
        for (double v : values){
            if (v > max) max = v;
        }
        return max;
    }

    public static double min(double ... values){
        if (values.length == 0) return Double.POSITIVE_INFINITY;
        double min = values[0];
        for (double v : values){
            if (v < min) min = v;
        }
        return min;
    }
}
