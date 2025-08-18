package Event_Listener_System;

// EventListener.java
// ইন্টারফেস যেখানে default methods থাকবে
public interface EventListener {
    // বাধ্যতামূলক মেথড
    void onEvent(Event event);

    // ডিফল্ট এরর হ্যান্ডলার
    default void onError(Exception e) {
        System.out.println("[Default Error Handler] Error occurred: " + e.getMessage());
    }

    // ডিফল্ট অ্যাক্টিভ স্ট্যাটাস
    default boolean isActive() {
        return true;
    }

    // পরে যোগ করা নতুন ডিফল্ট মেথড (Backward Compatibility এর জন্য)
    default void onEventProcessed(Event event) {
        System.out.println("[Default] Event processed: " + event.getName());
    }
}
