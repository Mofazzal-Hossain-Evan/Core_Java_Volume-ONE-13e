package ProductCatalogSystem;

import java.util.Objects;

public class ObjectInfo {
    private final int id;

    public ObjectInfo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object otheObject){
        if (this == otheObject) return true;
        if (otheObject == null) return false;
        if (!(otheObject instanceof ObjectInfo other)) return false;
        return id == other.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
@Override
    public String toString(){
        return "Object info[id=" + id + "]";
}

}
