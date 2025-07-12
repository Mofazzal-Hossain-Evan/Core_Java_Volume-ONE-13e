/* Package declaration to match directory structure */
package Shape_Drawing_Application;

/* Circle class implementing Measurable interface for drawing and measurements */
public final class Circle implements Measurable, Drawable {
    /* Instance variables for circle properties */
    private double radius; // Circle radius
    private String color; // Circle drawing color

    /* Constructor to initialize circle with radius and optional color */
    public Circle(double radius, String color) {
        this.radius = radius; // Set circle radius
        this.color = (color != null && !color.isEmpty()) ? color : Drawable.DEFAULT_COLOR;
    }

    /* Implements draw method from Drawable interface */
    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius " + radius + " in color " + color); // Print drawing action
    }

    /* Implements area method from Measurable interface */
    @Override
    public double area() {
        return Math.PI * radius * radius; // Calculate area (πr²)
    }

    /* Implements perimeter method from Measurable interface */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // Calculate circumference (2πr)
    }

    /* Getter for radius */
    public double getRadius() {
        return radius; // Return circle radius
    }

    /* Getter for color */
    public String getColor() {
        return color; // Return circle color
    }
}