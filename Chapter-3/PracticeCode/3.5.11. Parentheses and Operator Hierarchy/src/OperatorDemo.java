import com.sun.jdi.Value;

public class OperatorDemo {

    public static void main(String[] args) {
    boolean flag = false;
    System.out.println("!fla " + !flag);

    int number = 5;
        System.out.println(" number: " + ~number);
        System.out.println(" number: " + number++);
        System.out.println(" number: " + ++number);
        System.out.println(" number: " + --number);
        System.out.println(" number: " + +number);
        System.out.println(" number: " + -number);

        double x = 9.5;
        int castedx = (int) x;
        System.out.println("Casted : " +castedx);

        String text = "hello";
        System.out.println("text instanceof String: " + (text instanceof String));
/***
 * The expression (text instanceof String) is a type-checking operator in Java.
 It evaluates whether the object text is an instance of the class String or a subclass of String.
 ***/

        int value = 16;
        System.out.println("value << 1: " + (value << 1));
        System.out.println("value >> 1: " + (value >> 1));
        System.out.println("value >> 1: " + (value >> 1)); // Right shift (divide by 2)
        System.out.println("value >>> 1: " + (value >>> 1)); // Unsigned right shift

        int a = 10, b = 20;
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));



    }

}
