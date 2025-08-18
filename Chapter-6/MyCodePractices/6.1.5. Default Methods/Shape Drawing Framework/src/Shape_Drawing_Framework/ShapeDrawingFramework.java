/* Package declaration to match directory structure */
package Shape_Drawing_Framework;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes that default methods enable interface evolution, such as adding rotate(), without requiring updates to existing implementations like Rectangle, ensuring backward compatibility (Horstmann, p. 262). *Effective Java* (Item 20) highlights defaults for optional operations and overrides where needed (Bloch, p. 109). */

/* Class containing main method for testing Drawable implementations */
public class ShapeDrawingFramework {
    public static void main(String[] args) {
        /* Create Circle instance */
        Drawable circle = new Circle();
        System.out.println("Testing Circle (overrides erase, uses defaults for others):");
        circle.draw();
        System.out.println("Is visible? " + circle.isVisible()); // Uses default isVisible()
        circle.erase(); // Uses overridden erase()
        circle.rotate(90.0); // Uses default rotate()
        System.out.println();

        /* Create Rectangle instance */
        Drawable rectangle = new Rectangle();
        System.out.println("Testing Rectangle (uses default methods except draw):");
        rectangle.draw();
        System.out.println("Is visible? " + rectangle.isVisible()); // Uses default isVisible()
        try {
            rectangle.erase(); // Uses default erase(), expects exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Erase failed as expected: " + e.getMessage());
        }
        rectangle.rotate(45.0); // Uses default rotate()
        System.out.println();

        /* Demonstrate interface evolution: rotate() added as default, compatible with both implementations */
        System.out.println("Demonstrating interface evolution with rotate():");
        circle.rotate(180.0); // Default implementation
        rectangle.rotate(180.0); // Default implementation
    }
}