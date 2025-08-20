/* Package declaration to match directory structure */
package Shape_Rendering_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that the "class wins" rule means superclass methods override interface defaults, preventing conflicts even if interfaces have conflicting defaults (Horstmann, p. 261). */

/* Circle class extending BasicShape and implementing both interfaces, no override needed */
public class CircleWithSuperclass extends BasicShape implements Drawable, Renderable {
    // No override; uses superclass getDisplayName()

    public String getDisplayName() {
        return "Basic Shape";
    }
}