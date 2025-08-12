/* Package declaration to match directory structure */
package Custom_Collection_Framework;

/**
 * Theory (বাংলা):
 * --------------------------------
 * এই উদাহরণে আমরা একটি কাস্টম কালেকশন ফ্রেমওয়ার্ক বানাচ্ছি।
 * এখানে interface এর মধ্যে default method ব্যবহার করছি সুবিধাজনক ফাংশনালিটি দেওয়ার জন্য।
 *
 * size() → Abstract method (প্রতিটি implementation আলাদা করে দিবে)
 * isEmpty() → Default method (size() == 0 কিনা চেক করে)
 * clear() → Default method (UnsupportedOperationException থ্রো করে, যদি override না করা হয়)
 * toArray() → নতুন default method (interface evolution দেখানোর জন্য)
 */
public interface MyCollection<T> extends Iterable<T>{

    /* Abstract method: must be implemented by subclasses */
    int size();

    /* Default method: checks if collection is empty */
    default boolean isEmpty() {
        return size() == 0;
    }

    /* Default method: clears the collection (by default unsupported) */
    default void clear() {
        throw new UnsupportedOperationException("Clear operation not supported.");
    }

    /* New default method: interface evolution example */
    default Object[] toArray() {
        Object[] array = new Object[size()];
        int index = 0;
        for (T element : this) { // Uses Iterable's iterator
            array[index++] = element;
        }
        return array;
    }
}
