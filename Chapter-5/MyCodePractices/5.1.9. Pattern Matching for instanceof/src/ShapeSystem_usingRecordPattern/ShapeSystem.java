package ShapeSystem_usingRecordPattern;

public class ShapeSystem {
    public static void main(String[] args) {
        Circle c = new Circle(new Point(5, 6), 10);

        // Record Pattern Matching
        if (c instanceof Circle (Point(var a, var b), var r)) {
            System.out.println("Circle Center: (" + a + ", " + b + ")");
            System.out.println("Circle Radius: " + r);
        }
    }
}
