package custom_iterator;

public interface MyIterator<T> {
    boolean hasNext();

    T next();
    default void remove(){
        throw new UnsupportedOperationException("Remove..");
    }

    default void skip(int n){
        for (int i = 0; i < n && hasNext(); i++){
            next();
        }
    }
}
