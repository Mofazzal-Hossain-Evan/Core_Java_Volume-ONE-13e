package custom_iterator;

import java.util.Arrays;

public class ArrayIterator <T> implements MyIterator<T>{
    private T[] array;
    private int currentIndex = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
       // this.currentIndex = currentIndex;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }
    public T next(){
        return array[currentIndex++];
    }

    public void remove(){
        if (currentIndex == 0){
            throw new IllegalStateException("Call next() before remove()");
        }

        int removeIndex = currentIndex - 1;
        for (int i = removeIndex;i < array.length -1; i++){
            array[i] = array[i +1];
        }
        array[array.length -1] = null;
        currentIndex--;
        System.out.println("Element removed at index " + removeIndex);
    }
    public String toString(){
        return Arrays.toString(array);
    }
}
