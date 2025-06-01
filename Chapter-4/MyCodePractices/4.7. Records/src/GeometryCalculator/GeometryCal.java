package GeometryCalculator;

public class GeometryCal {
    public static void main(String[] args) {
        // Create some shapes
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        LineSegment line = new LineSegment(p1, p2);
        Circle circle = new Circle(new Point(0, 0), 5);
        Rectangle rect = new Rectangle(new Point(0, 0), 4, 6);

        // Calculate distances, areas, and perimeters
        System.out.println("Line segment length: " + line.length());
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());
        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Rectangle perimeter: " + rect.perimeter());
    }
}
