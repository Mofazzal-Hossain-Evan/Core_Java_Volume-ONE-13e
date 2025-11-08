/* Package declaration */
package Random_Map_Generator;

/* থিয়রি: *Core Java* (p. 274) বলে, POJO ক্লাস ম্যাপ ডেটা হোল্ড করে, যা ল্যামডা দিয়ে জেনারেট করা যায়। */

public class MapTile {
    private String type;
    private int value;

    public MapTile(String type, int value) {
        this.type = type;
        this.value = value;
    }

    // Getters
    public String getType() { return type; }
    public int getValue() { return value; }

    @Override
    public String toString() {
        return "[" + type + " | Value: " + value + "]";
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(int value) {
        this.value = value;
    }
}