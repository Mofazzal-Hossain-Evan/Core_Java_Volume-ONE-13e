package ShapeJudge;

public class ShapeJudge {
    public static void main(String[] args) {
        Shape[] shapes = {

                new Circle(10),
                new Circle(0),
                new Rectangle(5, 5),
                new Rectangle(10, 20),
                new Triangle(3, 4, 5),
                new Triangle(1, 1, 10) // invalid
        };

        for (Shape s : shapes){
            String verdict = switch (s) {
                case Circle c when  c.radius() <= 0 -> "❌ Invalid Circle";
                case Circle c -> "🟢 Circle with radius " + c.radius();
                case Rectangle r when r.length() == r.width() -> "🟥 Square";
                case Triangle t when isValidTriangle(t) -> "🔺 Valid Triangle";
                case Triangle t -> "❌ Invalid Triangle";
                default -> null;
            };
            System.out.println(s + " → " + verdict);
        }
    }

    private static boolean isValidTriangle(Triangle t){
        int a = t.a(), b = t.b(), c = t.c(); return
       a + b >c && a+ c > b && b + c > a;
    }
}
