/* Package declaration */
package Task_Priority_Assigner;

import java.util.*;
import java.util.function.*;

/* থিয়রি: *Core Java* (p. 274) — IntUnaryOperator ট্রান্সফর্মেশনের জন্য, Supplier ডিফল্টের জন্য। */

public class TaskPriorityAssigner {
    public static void main(String[] args) {
        // ১. প্রায়োরিটি বুস্টার (IntUnaryOperator)
        IntUnaryOperator priorityBooster = p -> p * 2;

        // ২. ডিফল্ট টাস্ক (Supplier)
        Supplier<Task> defaultTask = () -> new Task("Default Task", 1);

        // ৩. প্রায়োরিটি অ্যারে ইনিশিয়ালাইজ (Arrays.setAll)
        int numTasks = 5;
        int[] priorities = new int[numTasks];
        Arrays.setAll(priorities, i -> (i + 1) * 3); // 3, 6, 9, 12, 15

        // ৪. টাস্ক লিস্টে যোগ করা
        List<Task> taskQueue = new ArrayList<>();
        String[] descriptions = {
                "Debug the Quantum Compiler",
                "Feed the Code Dragon",
                "Prioritize the Unprioritizable",
                "Refactor the Multiverse",
                "Deploy to Production Dimension"
        };

        for (int i = 0; i < priorities.length; i++) {
            int boosted = priorityBooster.applyAsInt(priorities[i]);
            taskQueue.add(new Task(descriptions[i], boosted));
        }

        System.out.println("Initial Task Queue (After Boost):");
        taskQueue.forEach(System.out::println);
        System.out.println();

        // ৫. হাই প্রায়োরিটি ফিল্টার (Predicate)
        Predicate<Task> highPriority = task -> task.getPriority() > 20;
        List<Task> highPriorityTasks = taskQueue.stream()
                .filter(highPriority)
                .toList();

        System.out.println("High Priority Tasks (>20):");
        highPriorityTasks.forEach(System.out::println);
        System.out.println();

        // ৬. টোটাল প্রায়োরিটি ক্যালকুলেট (ToIntFunction)
        ToIntFunction<Task> priorityExtractor = Task::getPriority;
        int totalPriority = taskQueue.stream()
                .mapToInt(priorityExtractor)
                .sum();

        System.out.println("Total Priority Points: " + totalPriority);
        System.out.println();

        // ৭. ডিফল্ট টাস্ক (Objects.requireNonNullElseGet)
        Task missingTask = null; // ধরো, ডাটাবেস থেকে আসেনি
        Task safeTask = Objects.requireNonNullElseGet(missingTask, defaultTask);
        System.out.println("Safe Default Task: " + safeTask);
        System.out.println();

        // ৮. স্প্রিং বুট কিউ প্রসেসিং এমুলেশন
        System.out.println("Processing Tasks in Order (FIFO):");
        for (Task task : taskQueue) {
            System.out.println("Processing: " + task);
            // Simulate processing delay
            try { Thread.sleep(500); } catch (InterruptedException e) { /* ignore */ }
        }
        System.out.println("All tasks processed!");
    }
}