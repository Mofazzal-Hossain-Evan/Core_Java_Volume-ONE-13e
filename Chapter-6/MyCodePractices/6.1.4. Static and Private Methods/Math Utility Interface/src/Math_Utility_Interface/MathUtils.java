/* Package declaration to match directory structure */
package Math_Utility_Interface;

/**
 * Theory (বাংলা):
 * --------------------------------
 * এই উদাহরণে আমরা static method ব্যবহার করছি utility function তৈরির জন্য
 * যেমন factorial() বা fibonacci() যেগুলো instance ছাড়াই ডাকা যাবে।
 *
 * Private method checkNonNegative() static method-এর ভিতরে ব্যবহৃত হচ্ছে
 * ইনপুট চেক করার জন্য, যাতে negative value গেলে exception ছুঁড়ে দেয়।
 *
 * Static methods → Public utility functions
 * Private static methods → শুধুমাত্র interface এর ভেতরের লজিক সাপোর্ট করে
 */
public interface MathUtils {

    /* Static method to calculate factorial */
    static long factorial(int n) {
        checkNonNegative(n); // Validate input
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /* Static method to calculate fibonacci */
    static long fibonacci(int n) {
        checkNonNegative(n); // Validate input
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /* Private helper method for validation */
    private static void checkNonNegative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative: " + n);
        }
    }
}
