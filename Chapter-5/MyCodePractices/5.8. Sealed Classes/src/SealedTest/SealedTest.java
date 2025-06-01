package SealedTest;
import java.util.*;
public class SealedTest {
    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", new JSONString("HARRY"));
        obj.put("salary", new JSONNumber(90000));
        obj.put("married", JSONBoolean.FALSE);
        JSONArray arr = new JSONArray();
        arr.add(new JSONNumber(13));
        arr.add(JSONNull.INSTANCE);

        obj.put("luckyNumbers", arr);
        System.out.println(obj);
        JSONValue val = obj;
        System.out.println(val.type());
    }
}
