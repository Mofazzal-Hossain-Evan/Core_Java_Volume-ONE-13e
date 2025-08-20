/* Package declaration to match directory structure */
package Shape_Rendering_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that concrete methods in superclasses take precedence over default methods in interfaces, following the "class wins" rule (Horstmann, p. 261). */

/* Superclass BasicShape with concrete getDisplayName */
public class BasicShape {

    public String getDisplayName() {
        return "Basic Shape";
    }
}