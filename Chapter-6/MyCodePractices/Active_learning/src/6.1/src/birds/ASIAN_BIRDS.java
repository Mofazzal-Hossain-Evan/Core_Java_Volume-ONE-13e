package birds;

public class ASIAN_BIRDS {
    private bird_details[] BDINCN;
    //"আমি একটা private array বানাচ্ছি, যেখানে অনেকগুলো bird_details object থাকবে"


    public ASIAN_BIRDS() {

        BDINCN = new bird_details[]{
                new bird_details("Owl", "Brown", 30, 2.5),
                new bird_details("Eagle", "Black", 45, 3.0),
                new bird_details("Sparrow", "Red", 20, 1.0),
                new bird_details("Crow", "Black", 25, 1.8),
                new bird_details("Parrot", "Green", 22, 1.3),
                new bird_details("Kingfisher", "Blue", 35, 1.6),
                new bird_details("Duck", "White", 28, 2.8),
                new bird_details("Robin", "Red", 18, 0.9),
                new bird_details("WeirdBird",  "Black",  10, Double.NaN),
                new bird_details("ZeroBird",   "Black",  10, -0.0),
                new bird_details("ZeroBird2",  "Black",  10, 0.0)
        };

    }
    public bird_details[] getBDINCN() {
        return BDINCN;
    }
}
