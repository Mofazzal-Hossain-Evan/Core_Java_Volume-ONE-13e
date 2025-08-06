package Geometry_Calculator;

/* Test program to demonstrate static utility methods and validation */
public class GeometryTest {
    public static void main(String[] args) {
        // Using static methods directly without creating objects
        System.out.println("Static method circle area (radius=5): " + ShapeCalculator.circleArea(5));
        System.out.println("Static method rectangle area (3x4): " + ShapeCalculator.rectangleArea(3, 4));

        // Creating instances and using instance methods
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(6, 2.5);

        System.out.println("Circle instance area (radius=7): " + circle.getArea());
        System.out.println("Rectangle instance area (6x2.5): " + rectangle.getArea());

        // Try invalid input to test private method validation indirectly
        try {
            System.out.println("Attempt circle area with negative radius:");
            System.out.println(ShapeCalculator.circleArea(1)); // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Rectangle invalidRect = new Rectangle(3, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating rectangle: " + e.getMessage());
        }
    }
}
