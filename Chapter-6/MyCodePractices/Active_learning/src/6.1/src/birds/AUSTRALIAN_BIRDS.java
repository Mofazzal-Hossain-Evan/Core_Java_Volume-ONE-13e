package birds;

public class AUSTRALIAN_BIRDS {
    private bird_details[] AU;

    AUSTRALIAN_BIRDS(){
        AU = new bird_details[]{

                new bird_details("Owl",        "LightBrown", 35, 2.7),
                new bird_details("Eagle",      "WhiteBrown", 60, 3.8),
                new bird_details("Sparrow",    "Brown",      24, 1.1),
                new bird_details("Crow",       "Black",      32, 2.2),
                new bird_details("Parrot",     "BrightGreen",30, 1.6),
                new bird_details("Kingfisher", "SkyBlue",    36, 1.5),
                new bird_details("Duck",       "Cream",      29, 3.0),
                new bird_details("Robin",      "RedOrange",  21, 1.0)
        };

    }
    public bird_details[] getAU(){
        return AU;
    }
}
