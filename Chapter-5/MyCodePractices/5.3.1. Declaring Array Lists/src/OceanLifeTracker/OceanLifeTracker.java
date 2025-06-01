package OceanLifeTracker;

import java.util.ArrayList;

public class OceanLifeTracker {

    public static void main(String[] args) {


        var sightings = new ArrayList<MarineAnimal>();
        sightings.ensureCapacity(5);

        sightings.add(new MarineAnimal("Dolphin", 101, "Atlantic", false));
        sightings.add(new MarineAnimal("Blue Whale", 102, "Arctic", true));
        sightings.add(new MarineAnimal("Hammerhead Shark", 103, "Pacific", false));

        System.out.println("🌊 Marine Animal Sightings:");
        for (MarineAnimal a : sightings){
            System.out.println(" - " + a);
        }

        System.out.println("\n🔍 Total sightings recorded: " + sightings.size());
        ArrayList legacy = LegacySightingLoader.load();
        sightings.trimToSize();
    }
}