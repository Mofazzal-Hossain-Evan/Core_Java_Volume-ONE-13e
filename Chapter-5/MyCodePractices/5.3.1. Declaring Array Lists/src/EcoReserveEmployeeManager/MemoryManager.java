package EcoReserveEmployeeManager;

import java.util.ArrayList;

public class MemoryManager {

    public static <T> void prepareCapacity(ArrayList<T> list, int capacity){
        list.ensureCapacity(capacity);
        System.out.println("🛠️ Reserved memory for " + capacity + " elements.");
    }

    public static <T> void trimMemory(ArrayList<T> list){
        list.trimToSize();
        System.out.println("🧹 Trimmed unused memory to current size: " + list.size());
    }
}
