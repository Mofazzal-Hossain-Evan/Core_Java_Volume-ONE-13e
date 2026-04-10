package Fish;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fish {

    public static void main(String[] args) {
        var fish = new Market[3];

        fish[0] = new Market("Hilsha", 30,1.5);
        fish[1] = new Market("Ruhi", 44, 2.3);
        fish[2] = new Market("catfish", 30,1.5);
        Arrays.sort(fish);

        for(Market shopping : fish) {
            System.out.println( shopping.getName()+" " +shopping.getWeight()+" "
            + shopping.getPrice());
        }

        Market hilsha = fish[0];
        Market ruhi = fish[1];
        Market catfish = fish[2];

        Market smallest = hilsha;
        if(ruhi.compareTo(hilsha) < 0) {
            smallest = ruhi;
        }
        if(catfish.compareTo(smallest) < 0){
            smallest = catfish;
        }
        System.out.println("Smallest: " + smallest.getName()+"\n"+"Weight: "+ smallest.getWeight()+"\n"+
                "Price: "+ smallest.getPrice());

        Market largest = fish[0];

        for (int i = 1; i < fish.length; i++) {
            if (fish[i].compareTo(largest) < 0) {
                largest = fish[i];
            }
            System.out.println(fish[i].getName()+"\n"+"Price: "+ fish[i].getPrice());
        }

    }

}
