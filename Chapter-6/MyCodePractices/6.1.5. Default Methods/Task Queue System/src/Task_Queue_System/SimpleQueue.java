/* Package declaration to match directory structure */
package Task_Queue_System;

import java.util.LinkedList;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that implementations like SimpleQueue can rely on default methods (e.g., isEmpty(), cancel()) without overriding, demonstrating convenience and compatibility (Horstmann, p. 262). */

/* Simple queue implementation using LinkedList */
public class SimpleQueue<T> implements TaskQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    @Override
    public void add(T task) {
        queue.add(task);
    }

    @Override
    public int size() {
        return queue.size();
    }

    // Uses default isEmpty()

    // Uses default cancel() which throws UnsupportedOperationException

    // Uses default peek() which throws UnsupportedOperationException
}