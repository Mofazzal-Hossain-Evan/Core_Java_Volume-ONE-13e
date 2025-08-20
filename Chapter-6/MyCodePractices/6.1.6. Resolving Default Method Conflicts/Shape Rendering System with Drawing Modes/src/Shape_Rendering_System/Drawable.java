/* Package declaration to match directory structure */
package Shape_Rendering_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes how interfaces can provide default methods, but conflicts arise when multiple interfaces define the same default method, requiring resolution in the implementing class (Horstmann, p. 261). */

/* Interface Drawable with default getDisplayName */
public interface Drawable {
    default String getDisplayName() {
        return "Shape";
    }
}