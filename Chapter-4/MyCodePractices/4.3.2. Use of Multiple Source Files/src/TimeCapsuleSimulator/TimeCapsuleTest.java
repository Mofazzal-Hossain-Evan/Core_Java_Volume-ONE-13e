package TimeCapsuleSimulator;

import java.time.LocalDate;
import java.util.ArrayList;

public class TimeCapsuleTest {
    public static void main(String[] args) {
        TimeCapsule capsule = new TimeCapsule(new ArrayList<>(),LocalDate.of(2026, 1, 2));

        capsule.addItem(new Item("Letter", "Future me, remember to stay curious!"));
        capsule.addItem(new Item("USB Drive", "Contains memories from 2025"));

        capsule.openCapsule(LocalDate.of(2025, 1,1));

        capsule.openCapsule(LocalDate.of(2027, 2,2));
    }
}
