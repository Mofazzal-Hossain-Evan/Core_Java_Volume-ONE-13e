package Mini_JSON_Model;

public class SealedTest {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("name", new JSONString("Harry_JSTRING"));
        obj.put("salary", new JSONNumber(90000));
        obj.put("married", JSONBoolean.FALSE);

        JSONArray luckyNumbers = new JSONArray();
        luckyNumbers.add(new JSONNumber(7));
        luckyNumbers.add(new JSONNumber(13));
        luckyNumbers.add(JSONNull.INSTANCE);

        obj.put("luckyNumbers", luckyNumbers);

        System.out.println("JSON Data: " + obj);
        System.out.println("Object type: " + obj.type());
    }
}
