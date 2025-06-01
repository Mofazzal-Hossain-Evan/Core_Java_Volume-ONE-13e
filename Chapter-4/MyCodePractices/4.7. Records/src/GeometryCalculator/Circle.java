package GeometryCalculator;

public class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Area of the circle
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Perimeter (Circumference)
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
