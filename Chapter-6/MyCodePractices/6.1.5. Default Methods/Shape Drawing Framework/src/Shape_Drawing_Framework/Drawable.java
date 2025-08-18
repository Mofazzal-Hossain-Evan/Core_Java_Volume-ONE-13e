/* Package declaration to match directory structure */
package Shape_Drawing_Framework;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that default methods in interfaces like Drawable provide optional operations and enable interface evolution without breaking existing implementations (Horstmann, p. 262). *Effective Java* (Item 20) recommends using default methods for convenience and to maintain backward compatibility (Bloch, p. 109). */

/* Interface for drawable shapes with default methods */
public interface Drawable {
    /* Abstract method to draw the shape */
    public void draw();

    /* Default method for erase that throws exception */
    default void erase() {
        throw new UnsupportedOperationException("Erasing not supported");
    }

    /* Default method to check if visible */
    default boolean isVisible() {
        return true;
    }

    /* New default method for rotate to simulate interface evolution */
    default void rotate(double degrees) {
        System.out.println("Default rotation by " + degrees + " degrees - not specifically implemented");
    }
}