package Math_Utility_Interface;

public interface MathUnits {

    static long factorial(int n){
        checkNonNegative(n);
        long result = 1;
        for (int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    static long fibonacci(int n){
        checkNonNegative(n);
if (n == 0)return 0;
if (n == 1) return 1;
long a = 0, b = 1;
for (int i = 2; i <= n; i++){
    long temp = a + b;
    a = b;
    b = temp;
}
return b;
    }
}
