package ShapeDrawingSystem;

public class ShapeDrawingSystem {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("Red", 5.5);
        shapes[1] = new Rectangle("Blue", 4.0, 6.0);
        shapes[2] = new Triangle("Green", 3.0, 5.0);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}