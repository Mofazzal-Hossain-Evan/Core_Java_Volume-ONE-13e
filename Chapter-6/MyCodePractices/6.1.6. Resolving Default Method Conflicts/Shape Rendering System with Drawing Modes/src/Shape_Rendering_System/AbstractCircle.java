/* Package declaration to match directory structure */
package Shape_Rendering_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) states that if a class implements interfaces with abstract methods and does not provide implementations, it must be declared abstract (Horstmann, p. 261). */

/* Abstract Circle class implementing both abstract interfaces, no implementation */
public abstract class AbstractCircle implements AbstractDrawable, AbstractRenderable {
    // No implementation for getDisplayName(); class is abstract
}