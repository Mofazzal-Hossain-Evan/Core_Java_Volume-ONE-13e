/* Package declaration to match directory structure */
package Custom_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

/* MyArrayList implements MyCollection and supports clear() */
public class MyArrayList<T> implements MyCollection<T>, Iterable<T> {

    private ArrayList<T> list;

    public MyArrayList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    /* Overriding clear to actually remove elements */
    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
