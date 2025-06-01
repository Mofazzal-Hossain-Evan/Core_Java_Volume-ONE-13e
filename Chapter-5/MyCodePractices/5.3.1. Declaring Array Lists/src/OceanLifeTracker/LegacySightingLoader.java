package OceanLifeTracker;

import java.util.ArrayList;
import java.util.Objects;

public class LegacySightingLoader {

    public static ArrayList load() {
        ArrayList legacy = new ArrayList();

        legacy.add("Old record: Blue Whale seen near Iceland");
        legacy.add(2001);
        legacy.add(new MarineAnimal("Megalodon", 999, "Mythic Zone", true));

        System.out.println("\n📜 Legacy Sightings:");
        for (Object obj : legacy){
            System.out.println(" _ " + obj);
        }
        return legacy;
    }

}