package Shape_Drawing_Application;

 public final class Triangle implements Measurable, Drawable {
    private double a, b, c;
    private String color;

    public Triangle(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = (color != null && !color.isEmpty()) ? color : Drawable.DEFAULT_COLOR;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle with sides " + a + ", " + b + ", " + c + " in color " + color);
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    public String getColor() {
        return color;
    }
}
