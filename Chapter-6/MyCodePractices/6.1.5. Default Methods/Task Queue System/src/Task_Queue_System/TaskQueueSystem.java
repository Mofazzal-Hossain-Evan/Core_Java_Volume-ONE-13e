/* Package declaration to match directory structure */
package Task_Queue_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes that default methods allow interface evolution, such as adding peek(), without requiring changes to existing implementations like SimpleQueue, ensuring backward compatibility (Horstmann, p. 262). *Effective Java* (Item 20) highlights using defaults for convenience while allowing overrides for customization (Bloch, p. 109). */

/* Class containing main method for testing TaskQueue implementations */
public class TaskQueueSystem {
    public static void main(String[] args) {
        /* Create SimpleQueue instance */
        TaskQueue<String> simpleQueue = new SimpleQueue<>();
        System.out.println("Testing SimpleQueue (uses default methods for isEmpty, cancel, peek):");
        System.out.println("Is empty? " + simpleQueue.isEmpty()); // Uses default isEmpty()
        simpleQueue.add("Task1");
        simpleQueue.add("Task2");
        System.out.println("Size: " + simpleQueue.size());
        System.out.println("Is empty? " + simpleQueue.isEmpty()); // Uses default isEmpty()
        try {
            simpleQueue.cancel("Task1"); // Uses default cancel(), expects exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Cancel failed as expected: " + e.getMessage());
        }
        try {
            System.out.println("Peek: " + simpleQueue.peek()); // Uses default peek(), expects exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Peek failed as expected: " + e.getMessage());
        }
        System.out.println();

        /* Create PriorityTaskQueue instance (assumes String is Comparable) */
        TaskQueue<String> priorityQueue = new PriorityTaskQueue<>();
        System.out.println("Testing PriorityTaskQueue (uses default isEmpty, overrides cancel and peek):");
        System.out.println("Is empty? " + priorityQueue.isEmpty()); // Uses default isEmpty()
        priorityQueue.add("TaskB");
        priorityQueue.add("TaskA"); // PriorityQueue sorts naturally (alphabetical for strings)
        System.out.println("Size: " + priorityQueue.size());
        System.out.println("Is empty? " + priorityQueue.isEmpty()); // Uses default isEmpty()
        priorityQueue.cancel("TaskB"); // Uses overridden cancel()
        System.out.println("Size after cancel: " + priorityQueue.size());
        System.out.println("Peek: " + priorityQueue.peek()); // Uses overridden peek()
        System.out.println();

        /* Demonstrate interface evolution: peek() added as default, compatible with SimpleQueue (throws) and overridden in PriorityTaskQueue */
        System.out.println("Demonstrating interface evolution with peek():");
        try {
            simpleQueue.peek(); // Default throws, compatible without recompilation
        } catch (UnsupportedOperationException e) {
            System.out.println("SimpleQueue peek (default): " + e.getMessage());
        }
        System.out.println("PriorityTaskQueue peek (overridden): " + priorityQueue.peek());
    }
}