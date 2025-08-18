/* Package declaration to match directory structure */
package Shape_Drawing_Framework;

/* Theory: *Effective Java* (Item 20) suggests that classes like Rectangle can rely on default methods without overriding, such as erase() throwing an exception for unsupported operations (Bloch, p. 109). */

/* Rectangle shape implementation */
public class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void erase() {
        Drawable.super.erase();
    }

    @Override
    public boolean isVisible() {
        return Drawable.super.isVisible();
    }

    @Override
    public void rotate(double degrees) {
        Drawable.super.rotate(degrees);
    }
}
