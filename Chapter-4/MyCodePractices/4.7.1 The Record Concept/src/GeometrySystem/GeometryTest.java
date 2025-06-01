package GeometrySystem;

public class GeometryTest {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);
        System.out.println("Distance: " + p1.distance(p2));

        Circle c = new Circle(new Point(5, 5), 3);
        System.out.println("Circle Area: " + c.area());
        System.out.println("Point inside Circle? " + c.contains(p1));

        Rectangle r = new Rectangle(new Point(2, 2), 5, 4);
        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Point inside Rectangle? " + r.contains(p1));
    }
}
