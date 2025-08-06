package Geometry_Calculator;

/* Circle implements ShapeCalculator with instance-specific data and area */
public class Circle implements ShapeCalculator {
    private double radius;

    public Circle(double radius) {
        if (radius < 0)
            throw new IllegalArgumentException("Radius cannot be negative");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // Use static method from interface for calculation
        return ShapeCalculator.circleArea(radius);
    }

    public double getRadius() {
        return radius;
    }
}
