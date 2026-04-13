package birds;
import java.lang.Comparable;

import java.lang.Comparable;
import java.util.Objects;

public class bird_details implements Comparable<bird_details> {
    String name;
    String Color;
    int price;
    double weight;

    public bird_details(String name, String color, int price, double weight) {
        this.name = name;
        Color = color;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return Color;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public int compareTo(bird_details other) {
        int Bird_price = Integer.compare(this.price, other.price);

        if (Bird_price != 0){
            return Bird_price;
        }

        int Bird_color = this.Color.compareTo(other.Color);

        if (Bird_color != 0){
            return Bird_color;
        }

        int Bird_name = this.name.compareTo(other.name);
        if (Bird_name != 0){
            return Bird_name;
        }

        return  Double.compare(this.weight, other.weight);
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        //🧠 ১. this মানে কী?
        //
        //👉 this = বর্তমান object (current object)
        //যে object থেকে method call করা হচ্ছে, সেটাকেই this বলে।

        if (obj == null || getClass() != obj.getClass()) return false;

        bird_details other = (bird_details) obj;

        return this.price == other.price &&
                this.name.equals(other.name) &&
                this.Color.equals(other.Color) &&
                Double.compare(this.weight, other.weight) == 0;
    }

    @Override
    public int hashCode() {return java.util.Objects.hash(name, Color, price, weight);}
}