package Mini_JSON_Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public sealed interface JSONValue permits JSONArray, JSONObject, JSONPrimitive, SealedTest.JSONArray, SealedTest.JSONArray, SealedTest.JSONArray {

    default String type(){
        return switch (this){
            case JSONArray __ -> "array";
            case JSONObject __ -> "object";
            case JSONNumber __ -> "number";
            case JSONString __ -> "string";
            case JSONBoolean __ -> "boolean";
          //  case JSONPrimitive __-> "primitive";
            case JSONNull __ -> "null";
        };
    }
}

final class JSONArray extends ArrayList<JSONValue> implements JSONValue{}

final class JSONObject extends HashMap<String, JSONValue> implements JSONValue{
    public String toString(){
        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<String, JSONValue> entry : entrySet()) {
            if (result.length() > 1 ) result.append(", ");
            result.append("\"").append(entry.getKey()).append("\": ");
            result.append(entry.getValue());
        }
        result.append("}");
        return result.toString();
    }
}

sealed interface JSONPrimitive extends JSONValue permits JSONNull, JSONBoolean,  JSONNumber, JSONString {}

final record JSONNumber(double value) implements JSONPrimitive{
    public String toString(){
        return String.valueOf(value);
    }
}

final record JSONString(String value) implements JSONPrimitive{
    public String toString(){
        return "\"" + value.replace("\"", "\\\"") + "\"";
    }
}

enum JSONBoolean implements JSONPrimitive{
    TRUE, FALSE;

    public String toString(){
        return name().toLowerCase();
    }
}

enum JSONNull implements JSONPrimitive {
    INSTANCE;

    public String toString() {
        return "null";
    }
}
