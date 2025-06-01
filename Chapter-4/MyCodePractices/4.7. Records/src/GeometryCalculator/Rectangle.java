package GeometryCalculator;

public class Rectangle {
    private Point bottomLeft;
    private double width;
    private double height;

    public Rectangle(Point bottomLeft, double width, double height) {
        this.bottomLeft = bottomLeft;
        this.width = width;
        this.height = height;
    }

    // Area of the rectangle
    public double area() {
        return width * height;
    }

    // Perimeter of the rectangle
    public double perimeter() {
        return 2 * (width + height);
    }
}
