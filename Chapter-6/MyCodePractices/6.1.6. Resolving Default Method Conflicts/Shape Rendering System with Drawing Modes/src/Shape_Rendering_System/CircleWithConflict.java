/* Package declaration to match directory structure */
package Shape_Rendering_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that when implementing multiple interfaces with conflicting default methods, the class must override the method to resolve the conflict, potentially using super to invoke a specific default (Horstmann, p. 261). */

/* Circle class implementing both interfaces, resolving conflict by overriding */
public class CircleWithConflict implements Drawable, Renderable {
    @Override
    public String getDisplayName() {
        return Drawable.super.getDisplayName();

        // Resolves by choosing Drawable's default
    }
//    public String getDisplayName(){
//        return "Shape";
//    }
}