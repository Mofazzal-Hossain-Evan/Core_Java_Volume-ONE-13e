package lambda_lab;

import java.util.function.IntUnaryOperator;

public class AmbiguityDemo {
    public static int[] fill(int n, IntUnaryOperator op){
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = op.applyAsInt(i);
        return arr;
    }

}
