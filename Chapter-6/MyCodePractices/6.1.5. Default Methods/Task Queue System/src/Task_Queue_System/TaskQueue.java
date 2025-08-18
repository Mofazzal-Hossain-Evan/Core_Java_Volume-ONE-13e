/* Package declaration to match directory structure */
package Task_Queue_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that default methods in interfaces like TaskQueue provide convenience implementations and enable interface evolution without breaking existing implementations (Horstmann, p. 262). *Effective Java* (Item 20) recommends using default methods judiciously to add functionality while maintaining backward compatibility (Bloch, p. 109). */

/* Interface for task queues with default methods */
public interface TaskQueue<T> {
    /* Abstract method to add a task */
    void add(T task);

    /* Abstract method to get the size */
    int size();

    /* Default method to check if empty */
    default boolean isEmpty() {
        return size() == 0;
    }

    /* Default method for cancel that throws exception */
    default void cancel(T task) {
        throw new UnsupportedOperationException("Cancellation not supported");
    }

    /* New default method for peek to simulate interface evolution */
    default T peek() {
        throw new UnsupportedOperationException("Peek not supported");
    }
}