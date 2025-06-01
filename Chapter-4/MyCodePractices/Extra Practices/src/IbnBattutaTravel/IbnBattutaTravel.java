package IbnBattutaTravel;

public class IbnBattutaTravel {
    public static void main(String[] args) {
        System.out.println("Testing loseGold:");
        int gold = 100;
        System.out.println("Before: gold=" + gold);
        loseGold(gold, 20);
        System.out.println("After: gold=" + gold);

        //test 2

        System.out.println("\nTesting gainReputation:");
        Traveler ibnBattuta = new Traveler("Ibn Battuta", 50);
        System.out.println("Before: reputation=" + ibnBattuta.getReputation());
        gainRepotation(ibnBattuta, 30);
        System.out.println("After: reputation=" + ibnBattuta.getReputation() );

        // test 3
        System.out.println("\nTesting swapCities:");
        City city1 = new City("Cairo");
         City city2 = new City("Dehli");
        System.out.println("Before: City 1=" + city1.getName() + ", City 2=" + city2.getName());
        swapCities(city1,city2);
        System.out.println("After: City 1=" + city1.getName() + ", City 2=" + city2.getName());
    }

    public static void loseGold(int gold, int amount){// wont work
        gold -= amount;
        System.out.println("End of method: gold=" + gold);
    }

    public static void gainRepotation(Traveler traveler, int points){//works
        traveler.increaseRepotation(points);
        System.out.println("End of method: reputation=" + traveler.getReputation());
    }

    public static void swapCities(City c1, City c2){
        City temp = c1;
        c1 = c2;
        c2 = temp;
        System.out.println("End of method: City 1=" + c1.getName() +c2.getName() );
    }
}