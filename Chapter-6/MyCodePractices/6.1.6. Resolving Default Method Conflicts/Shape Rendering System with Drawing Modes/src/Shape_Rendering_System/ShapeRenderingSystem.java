/* Package declaration to match directory structure */
package Shape_Rendering_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes resolving interface conflicts through overrides and the "class wins" rule for superclass methods. No conflict if one method is abstract (Horstmann, p. 261). *Effective Java* (Item 21) warns about potential issues with multiple default methods (Bloch, p. 112). */

/* Class containing main method for testing shape classes */
public class ShapeRenderingSystem {
    public static void main(String[] args) {
        /* Test CircleWithConflict: override resolves conflict */
        CircleWithConflict circleConflict = new CircleWithConflict();
        System.out.println("CircleWithConflict getDisplayName(): " + circleConflict.getDisplayName());
        System.out.println();

        /* Test CircleWithSuperclass: superclass wins, no conflict */
        CircleWithSuperclass circleSuper = new CircleWithSuperclass();
        System.out.println("CircleWithSuperclass getDisplayName(): " + circleSuper.getDisplayName());
        System.out.println();

        /* Demonstrate scenario where neither interface has default: AbstractCircle is abstract */
        // Cannot instantiate AbstractCircle directly; would need a concrete subclass
        // For example:
        // class ConcreteCircle extends AbstractCircle {
        //     @Override
        //     public String getDisplayName() {
        //         return "Concrete Circle";
        //     }
        // }
        // But for demonstration, note that AbstractCircle compiles as abstract without implementation

        /* Note: If one interface has default and the other abstract, class uses default without override */
        // Example: class CircleWithOneAbstract implements Drawable, AbstractRenderable { }
        // Would use Drawable's default, no conflict or error
    }
}