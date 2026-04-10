package Fish;
import java.util.Objects;
import java.lang.Comparable;

public class Market implements Comparable<Market> {

    String name;
    int price;
    double weight;

    public Market(String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public int compareTo(Market other)
     {
         int priceCompare = Integer.compare(this.price, other.price);
         if( priceCompare != 0)
         {
             return priceCompare;
         }
         return Double.compare(this.weight, other.weight);
     }
     @Override
    public boolean equals(Object other) {

        if(this == other) return true;

        if(!(other instanceof Market)) return false;
        Market otherMarket = (Market)other;

        return this.price == otherMarket.price &&
                Double.compare(this.weight ,otherMarket.weight) == 0;
     }

}
