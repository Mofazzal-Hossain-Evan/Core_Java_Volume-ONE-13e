/* Package declaration to match directory structure */
package Task_Queue_System;

import java.util.PriorityQueue;

/* Theory: *Effective Java* (Item 20) suggests overriding default methods in implementations like PriorityTaskQueue when specialized behavior is needed, such as supporting cancellation, while still benefiting from other defaults (Bloch, p. 109). */

/* Priority queue implementation, assuming T is Comparable */
public class PriorityTaskQueue<T extends Comparable<T>> implements TaskQueue<T> {
    private PriorityQueue<T> queue = new PriorityQueue<>();

    @Override
    public void add(T task) {
        queue.add(task);
    }

    @Override
    public int size() {
        return queue.size();
    }

    // Uses default isEmpty()

    @Override
    public void cancel(T task) {
        if (!queue.remove(task)) {
            throw new IllegalArgumentException("Task not found: " + task);
        }
        System.out.println("Cancelled task: " + task);
    }

    @Override
    public T peek() {
        return queue.peek();
    } // Overrides default peek() for actual implementation
}