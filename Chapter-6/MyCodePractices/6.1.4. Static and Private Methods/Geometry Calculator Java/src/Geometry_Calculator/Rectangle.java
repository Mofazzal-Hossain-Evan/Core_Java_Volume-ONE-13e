/* Package declaration */
package Geometry_Calculator;

/**
 * Rectangle Class
 * ---------------
 * থিওরি (বাংলা):
 * ========================
 * - Rectangle class implements ShapeCalculator interface।
 * - instance-level width এবং height রাখে।
 * - instance method getArea() interface এর static method ব্যবহার করে area দেয়।
 */
public class Rectangle implements ShapeCalculator {

    /* Width and height */
    private double width;
    private double height;

    /* Constructor */
    public Rectangle(double width, double height) {
        // Validate via interface static method (which calls private helper)
        ShapeCalculator.rectangleArea(width, height);
        this.width = width;
        this.height = height;
    }

    /* Instance method to get area */
    public double getArea() {
        return ShapeCalculator.rectangleArea(width, height);
    }

    @Override
    public String getDescription() {
        return "Rectangle with width " + width + " and height " + height;
    }
}
