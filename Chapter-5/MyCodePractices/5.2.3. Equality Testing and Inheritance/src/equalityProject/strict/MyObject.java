package equalityProject.strict;

public class MyObject {

    public boolean equals(Object other) {
        return this == other;
    }

    public int hashCode(){
        return System.identityHashCode(this);
    }

    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
