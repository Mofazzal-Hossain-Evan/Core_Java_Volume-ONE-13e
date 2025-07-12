/* Package declaration to match directory structure */
package Shape_Drawing_Application;

public sealed interface Drawable permits Circle, Rectangle, Triangle, Measurable {
    String DEFAULT_COLOR = "Black";
    void draw();
}
