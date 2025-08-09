/* Package declaration */
package Geometry_Calculator;

/**
 * Circle Class
 * ------------
 * থিওরি (বাংলা):
 * ========================
 * - Circle class implements ShapeCalculator interface।
 * - instance-level radius field রাখে এবং instance method দিয়ে area দেয়।
 * - static method circleArea ব্যবহার করে instance-specific area calculate করে।
 */
public class Circle implements ShapeCalculator {

    /* Radius of the circle */
    private double radius;

    /* Constructor */
    public Circle(double radius) {
        // Validate radius via interface private method indirectly through static method
        ShapeCalculator.circleArea(radius);
        this.radius = radius;
    }

    /* Instance method to calculate area */
    public double getArea() {
        return ShapeCalculator.circleArea(radius);
    }

    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
}
