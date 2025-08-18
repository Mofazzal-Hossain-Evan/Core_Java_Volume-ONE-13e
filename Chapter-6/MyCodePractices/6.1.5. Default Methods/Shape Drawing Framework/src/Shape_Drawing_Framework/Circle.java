/* Package declaration to match directory structure */
        package Shape_Drawing_Framework;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that implementations like Circle can override default methods (e.g., erase()) for specific behavior while relying on others (e.g., isVisible()) (Horstmann, p. 262). */

/* Circle shape implementation */
public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the circle");
    }
    public boolean isVisible(){
        return false;
    }

    public void rotate(double degrees){
        System.out.println("");
    }
}
