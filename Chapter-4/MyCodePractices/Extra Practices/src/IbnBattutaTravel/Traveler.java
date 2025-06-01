package IbnBattutaTravel;

public class Traveler {

    private String name;
    private int reputation;

    public Traveler(String name, int reputation) {
        this.name = name;
        this.reputation = reputation;
    }

    //public String getName() {
      //  return name;
    //}

    public int getReputation() {
        return reputation;
    }

    public void increaseRepotation(int points){
        reputation =+points;
    }
}
