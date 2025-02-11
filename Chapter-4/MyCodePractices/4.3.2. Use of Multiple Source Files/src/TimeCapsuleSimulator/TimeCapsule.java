package TimeCapsuleSimulator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class TimeCapsule {
    private ArrayList<Item> items;
    private LocalDate unlockDate;

    public TimeCapsule(ArrayList<Item> items, LocalDate unlockDate) {
        this.items = new ArrayList<>();
        this.unlockDate = unlockDate;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void openCapsule(LocalDate today){
        if (today.isBefore(unlockDate)){
            System.out.println("Capsule is still locked until " + unlockDate);
        } else {
            System.out.println("Opening time capsule!");
            for (Item i : items) {
                System.out.println(i.getDetails());
            }
        }
    }
}
