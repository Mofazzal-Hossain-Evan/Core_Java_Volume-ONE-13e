/* Package declaration to match directory structure */
package Shape_Drawing_Application;

/* Rectangle class implementing Measurable interface for drawing and measurements */
public final class Rectangle implements Measurable, Drawable {
    /* Instance variables for rectangle properties */
    private double width; // Rectangle width
    private double height; // Rectangle height
    private String color; // Rectangle drawing color

    /* Constructor to initialize rectangle with width, height, and optional color */
    public Rectangle(double width, double height, String color) {
        this.width = width; // Set rectangle width
        this.height = height; // Set rectangle height
        this.color = (color != null && !color.isEmpty()) ? color : Drawable.DEFAULT_COLOR;
    }

    /* Implements draw method from Drawable interface */
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width " + width + ", height " + height + " in color " + color); // Print drawing action
    }

    /* Implements area method from Measurable interface */
    @Override
    public double area() {
        return width * height; // Calculate area (width * height)
    }

    /* Implements perimeter method from Measurable interface */
    @Override
    public double perimeter() {
        return 2 * (width + height); // Calculate perimeter (2 * (width + height))
    }

    /* Getter for width */
    public double getWidth() {
        return width; // Return rectangle width
    }

    /* Getter for height */
    public double getHeight() {
        return height; // Return rectangle height
    }

    /* Getter for color */
    public String getColor() {
        return color; // Return rectangle color
    }
}