/* Package declaration */
package Geometry_Calculator;

/**
 * ShapeCalculator Interface
 * -------------------------
 * থিওরি (বাংলা):
 * ========================
 * - এখানে static method ব্যবহার করে standalone geometric calculation করা হয়েছে।
 * - private static method `checkPositive` input validation এর জন্য ব্যবহৃত হয়েছে,
 *   যাতে সকল ইনপুট non-negative হয়। এটা interface এর ভিতরে encapsulated।
 * - static method হওয়ায়, instance ছাড়াই direct কল করা যায় (ShapeCalculator.circleArea(...))।
 */
public interface ShapeCalculator {

    /* Calculate circle area given radius */
    static double circleArea(double radius) {
        checkPositive(radius); // validate radius
        return Math.PI * radius * radius;
    }

    /* Calculate rectangle area given width and height */
    static double rectangleArea(double width, double height) {
        checkPositive(width);
        checkPositive(height);
        return width * height;
    }

    /* Private helper method to check non-negative input */
    private static void checkPositive(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative: " + value);
        }
    }

    /* Abstract method for implementations to return description */
    String getDescription();
}
