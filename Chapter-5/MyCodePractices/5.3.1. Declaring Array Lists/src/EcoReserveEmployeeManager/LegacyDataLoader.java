package EcoReserveEmployeeManager;

import java.util.ArrayList;

public class LegacyDataLoader {

    public static ArrayList load(){

        // ✅ Raw type without generics
        ArrayList legacy = new ArrayList();

        legacy.add("Old record: Wild Bison relocation");
        legacy.add(1992);
        legacy.add(new Employee("Legacy Ranger", 999, "Unknown", "Old Forest", 0));

        System.out.println("\n📜 Legacy Data (Raw Type):");
        for (Object obj : legacy) {
            System.out.println(" - " + obj);
        }
        return legacy;
    }
}
