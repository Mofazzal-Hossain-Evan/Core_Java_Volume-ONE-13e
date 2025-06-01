package Legacy_Course_Enrollment_Modernization_System;

// 🔹 Adapter class: Legacy থেকে Modern এ রূপান্তর

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ModernAdapter {

    // এখানে unchecked warning suppress করা হলো কারণ raw list ব্যবহার করছি
    @SuppressWarnings("unchecked")
    public ArrayList<ModernCourse> convertRawToModern(ArrayList rawList){
        ArrayList<ModernCourse> modernList = new ArrayList<>();
        for (Object o : rawList){
            if (o instanceof LegacyCourse){
                LegacyCourse legacy = (LegacyCourse) o;
                ModernCourse modern = new ModernCourse(legacy.getCourseName(), legacy.getCredits());
                modernList.add(modern);
            } else {
                System.out.println("⚠️ Skipped invalid entry: " + o);
            }
        }
return  modernList;
}
}
