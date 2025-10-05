/* Package declaration to match directory structure */
package Game_Event_Handler;

import java.time.LocalDateTime;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) discusses using classes like GameEvent to manage data in simulations, enabling lambda-based operations for dynamic event handling in Android-like game loops (Horstmann, p. 274). *Effective Java* (Item 42) recommends simple data structures for functional programming with lambdas (Bloch, p. 200). */

/* GameEvent class with basic fields */
public class GameEvent {
    private String type;
    private LocalDateTime timestamp;

    public GameEvent(String type) {
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    // Getters
    public String getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + timestamp.toLocalTime() + "] " + type;
    }
}