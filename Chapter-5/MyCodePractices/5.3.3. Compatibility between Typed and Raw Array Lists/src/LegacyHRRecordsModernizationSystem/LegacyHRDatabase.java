package LegacyHRRecordsModernizationSystem;

import java.util.ArrayList;

public class LegacyHRDatabase {

    public void addRecord(ArrayList list){
        list.add("Temporary Data");
    }

    public ArrayList fetchRecord(String dept){
        ArrayList result = new ArrayList();
        result.add(new LegacyEmployee("John", "HR"));
        result.add("Corrupted entry");
        return result;
    }
}
