/* Package declaration to match directory structure */
package Game_Entity_System;

/* Theory: *Effective Java* (Item 18) warns that inheritance from abstract classes like AbstractEntity can lead to fragile base classes, where changes to the abstract class affect all subclasses. For example, SimpleAbstractEntity inherits both move and attack methods, even if it only needs rendering, unlike the interface-based approach where NPC can selectively implement Moveable (Bloch, p. 90). */

/* Concrete class extending AbstractEntity for comparison */
public class SimpleAbstractEntity extends AbstractEntity {
    /* Constructor to initialize SimpleAbstractEntity with position */
    public SimpleAbstractEntity(double x, double y) {
        super(x, y); // Call AbstractEntity constructor to set position
    }

    /* Implements render method from AbstractEntity */
    @Override
    public void render() {
        System.out.println("Rendering SimpleAbstractEntity at position (" + x + ", " + y + ")"); // Print rendering action
    }
}