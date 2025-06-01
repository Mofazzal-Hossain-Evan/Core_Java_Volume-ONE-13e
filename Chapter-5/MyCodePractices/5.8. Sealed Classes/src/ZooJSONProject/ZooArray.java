package ZooJSONProject;

import java.util.ArrayList;
import java.util.Map;

public final class ZooArray extends ArrayList<ZooValue> implements ZooValue {
    public String toString() {
        StringBuilder sb = new StringBuilder("ZooArray:\n");
        for (ZooValue zv : this) {
            sb.append("  - ").append(zv.toString()).append("\n");
        }
        return sb.toString();
    }
}
