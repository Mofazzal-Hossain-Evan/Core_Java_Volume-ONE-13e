package birds;

public class EUROPEAN_BIRDS {

    private bird_details[] GBFRDE;

    public EUROPEAN_BIRDS(){

        GBFRDE = new bird_details[]{

                new bird_details("Owl",        "Grey",   32, 2.6),
                new bird_details("Eagle",      "Brown",  50, 3.2),
                new bird_details("Sparrow",    "Brown",  21, 1.1),
                new bird_details("Crow",       "Black",  27, 2.0),
                new bird_details("Parrot",     "Green",  25, 1.4),
                new bird_details("Kingfisher", "Blue",   33, 1.5),
                new bird_details("Duck",       "White",  30, 3.1),
                new bird_details("Robin",      "Orange", 19, 1.0),
                new bird_details("WeirdBird", "Black", 10, Double.NaN),
                new bird_details("ZeroBird", "Black", 10, -0.0),
                new bird_details("ZeroBird2", "Black", 10, 0.0),
        };
    }

    public bird_details[] getGBFRDE(){
        return GBFRDE;
    }
}
