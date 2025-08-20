/* Package declaration to match directory structure */
package Shape_Rendering_System;

/* Theory: *Effective Java* (Item 21) discusses the importance of designing interfaces carefully to avoid conflicts in default methods when multiple interfaces are implemented (Bloch, p. 112). */

/* Interface Renderable with default getDisplayName */
public interface Renderable {
    default String getDisplayName() {
        return this.getClass().getSimpleName();
    }
}