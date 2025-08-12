/* Package declaration to match directory structure */
package Custom_Collection_Framework;

import java.util.Arrays;

public class TestCustomCollection {
    public static void main(String[] args) {

        /* MyArrayList supports clear() */
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Apple");
        myArrayList.add("Banana");

        System.out.println("MyArrayList is empty? " + myArrayList.isEmpty());
        myArrayList.clear();
        System.out.println("MyArrayList after clear, size: " + myArrayList.size());

        /* MySet does not support clear(), will throw exception */
        MySet<Integer> mySet = new MySet<>();
        mySet.add(10);
        mySet.add(20);
        System.out.println("MySet is empty? " + mySet.isEmpty());

        try {
            mySet.clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("MySet clear() error: " + e.getMessage());
        }

        /* Testing new default method toArray() */
        myArrayList.add("Orange");
        myArrayList.add("Mango");
        System.out.println("Array from MyArrayList: " + Arrays.toString(myArrayList.toArray()));

        mySet.add(30);
        System.out.println("Array from MySet: " + Arrays.toString(mySet.toArray()));
    }
}
