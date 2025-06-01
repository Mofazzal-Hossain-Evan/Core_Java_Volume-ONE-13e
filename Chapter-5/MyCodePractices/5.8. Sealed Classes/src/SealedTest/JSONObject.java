package SealedTest;




import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

final class JSONObject extends HashMap<String, JSONValue> implements JSONValue {
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (Map.Entry<String, JSONValue> entry : entrySet())
        {
            if (result.length() > 1 ) result.append(",");
            result.append(" \"");
            result.append(entry.getKey());
            result.append("\": ");
            result.append(entry.getValue());
        } result.append("}");
        return result.toString();
    }
}
