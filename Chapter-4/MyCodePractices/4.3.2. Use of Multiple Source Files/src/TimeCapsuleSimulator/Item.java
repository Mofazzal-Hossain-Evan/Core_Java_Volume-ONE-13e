package TimeCapsuleSimulator;

import java.time.LocalDate;

public class Item {

    private String name;
    private LocalDate yearAdded;
    private String message;

    public Item( String name, String message) {
        this.yearAdded = LocalDate.now();
        this.name = name;
        this.message = message;
    }

    public String getDetails(){
        return "Item: " + name + " | Added: " + yearAdded + " | Message: " + message;

    }
}
