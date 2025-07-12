package Shape_Drawing_Application;

public class ShapeDrawingApp {
    public static void processShapes(java.util.List<Drawable> shapes)
    {

        System.out.println("Processing shapes:");
        /* Iterate through the list of shapes */
        for (Drawable shape : shapes) {
            /* Draw the shape */
            shape.draw();
            /* Check if the shape is Measurable */
            if (shape instanceof Measurable measurable) {
                /* Calculate and print area and perimeter for Measurable shapes */
                System.out.println("Area: " + measurable.area());
                System.out.println("Perimeter: " + measurable.perimeter());
            } else {
                System.out.println("Shape is not Measurable");
            }
            System.out.println(); // Blank line for readability
        }
    }

    /* Main method to run the shape drawing simulation */
    public static void main(String[] args) {
        /* Create a list to store shapes */
        java.util.List<Drawable> shapes = new java.util.ArrayList<>();

        /* Add sample shapes to the list */
        shapes.add(new Circle(5.0, "Red")); // Circle with radius 5, red color
        shapes.add(new Rectangle(4.0, 6.0, "Blue")); // Rectangle with width 4, height 6, blue color
        shapes.add(new Triangle(3.0, 4.0, 5.0, "")); // Triangle with sides 3, 4, 5, default color
        shapes.add(new Circle(2.0, null)); // Circle with radius 2, default color

        /* Process all shapes to demonstrate drawing and measurements */
        processShapes(shapes);
    }
}
