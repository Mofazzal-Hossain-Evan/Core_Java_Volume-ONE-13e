/* Package declaration */
package Geometry_Calculator;

/**
 * GeometryCalculatorTest Class
 * ---------------------------
 * থিওরি (বাংলা):
 * ========================
 * - এখানে আমরা static methods দিয়ে area calculate করছি।
 * - private validation method input গুলো সঠিক কিনা চেক করে।
 * - যদি ভুল ইনপুট দেওয়া হয় (negative), তাহলে exception দেখায়।
 * - পাশাপাশি Circle ও Rectangle class instance তৈরি করে তাদের area বের করছি।
 */
public class GeometryCalculatorTest {

    public static void main(String[] args) {

        // Static method usage: circle area
        System.out.println("Circle area with radius 5: " + ShapeCalculator.circleArea(5));

        // Static method usage: rectangle area
        System.out.println("Rectangle area 4 x 7: " + ShapeCalculator.rectangleArea(4, 7));

        System.out.println();

        // Using Circle class instance
        Circle circle = new Circle(3.5);
        System.out.println(circle.getDescription());
        System.out.println("Area: " + circle.getArea());

        // Using Rectangle class instance
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.getDescription());
        System.out.println("Area: " + rectangle.getArea());

        System.out.println();

        // Testing validation: negative input (will throw exception)
        try {
            System.out.println("Trying negative radius...");
            ShapeCalculator.circleArea(-2);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }

        try {
            System.out.println("Trying negative width...");
            Rectangle invalidRectangle = new Rectangle(-3, 5);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}
