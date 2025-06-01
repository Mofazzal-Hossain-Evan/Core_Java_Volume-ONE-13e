package MathUtilityClass;


public class myMath {

    public static int square(int x){
        return x * x;
    }

    public static int cube(int x){
        return x * x * x;
    }

    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Square of five: "+ myMath.square(5));
        System.out.println("Cube of 3: " + myMath.cube(3));
        System.out.println("Factorial of 5: " + myMath.factorial(5));
    }

}
