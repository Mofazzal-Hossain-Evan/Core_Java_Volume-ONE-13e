/* Package declaration to match directory structure */
package Shape_Rendering_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) confirms that if both interfaces declare the method abstract, the implementing class must provide an implementation or be abstract itself (Horstmann, p. 261). */

/* Interface with abstract getDisplayName */
public interface AbstractRenderable {
    String getDisplayName(); // Abstract, no default
}