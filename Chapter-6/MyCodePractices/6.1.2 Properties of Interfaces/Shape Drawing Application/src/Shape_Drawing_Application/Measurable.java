/* Package declaration to match directory structure */
package Shape_Drawing_Application;

/* Defines the Measurable interface, extending Drawable, for shapes with area and perimeter */
public sealed interface Measurable extends Drawable permits Circle, Rectangle, Triangle {
    /* Declares method to calculate the shape's area */
    double area();

    /* Declares method to calculate the shape's perimeter */
    double perimeter();
}