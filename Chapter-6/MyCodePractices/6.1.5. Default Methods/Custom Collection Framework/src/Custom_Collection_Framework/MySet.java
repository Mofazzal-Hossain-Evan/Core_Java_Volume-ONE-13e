/* Package declaration to match directory structure */
package Custom_Collection_Framework;

import java.util.HashSet;
import java.util.Iterator;

/* MySet implements MyCollection but does NOT override clear() */
public class MySet<T> implements MyCollection<T>, Iterable<T> {

    private HashSet<T> set;

    public MySet() {
        this.set = new HashSet<>();
    }

    public void add(T element) {
        set.add(element);
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public Iterator<T> iterator() {
        return set.iterator();
    }
}
