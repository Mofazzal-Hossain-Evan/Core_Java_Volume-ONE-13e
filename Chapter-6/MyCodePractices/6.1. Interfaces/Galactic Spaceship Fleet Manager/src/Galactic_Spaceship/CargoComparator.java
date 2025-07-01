package Galactic_Spaceship;

import java.util.Comparator;

public class CargoComparator implements  Comparator<Spaceship> {

    public int compare(Spaceship s1, Spaceship s2){
        int capacityCompare = Integer.compare(s2.getCargoCapacity(), s1.getCargoCapacity());

        if (capacityCompare == 0){
            return s1.getShipName().compareToIgnoreCase(s2.getShipName());
        }
        return capacityCompare;
    }
}
