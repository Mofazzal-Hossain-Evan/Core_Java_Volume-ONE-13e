package VintageStudentRecordMigration;

import LegacyHRRecordsModernizationSystem.LegacyEmployee;

import java.util.ArrayList;

public class LegacyCollegeSystem {

    // ⚠️ পুরনো মেথড — raw ArrayList ব্যবহার করে
    public ArrayList getRawStudentRecords(){
        ArrayList list = new ArrayList();
        list.add(new LegacyStudent("Robin", 43));
        list.add(new LegacyStudent("Karim", 344));
        list.add("Corrupted data"); // ⚠️ ভুল ধরনের ডেটা
return list;

/*
🧠 কেন raw list return করা হয়েছে?
কারণ এটা পুরনো (legacy) Java code-এর simulation — যেখানে Java Generics এখনো ব্যবহার করা হয়নি।
Generics আসার আগে, ArrayList এ যেকোনো ধরনের object রাখা যেত।

* */
    }
}
