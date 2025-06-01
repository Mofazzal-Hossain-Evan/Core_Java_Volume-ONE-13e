package ZooJSONProject;

import java.util.HashMap;
import java.util.Map;

public final class ZooObject extends HashMap<String, ZooValue> implements ZooValue {
    public String toString() {
        StringBuilder sb = new StringBuilder("Zoo Map:\n");
        for (Map.Entry<String, ZooValue> entry : entrySet()) {
            sb.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}

