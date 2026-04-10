package Fruit;

public class Fruit implements Comparable<Fruit>{

    private String name;
    private int price;
    private double llb;

    public Fruit(String name, int price, double llb) {
        this.name = name;
        this.price = price;
        this.llb = llb;
    }

    public String getName() {
        return name;
    }

    public double getLlb() {
        return llb;
    }

    public int getPrice() {
        return price;
    }

    public double WeightCal(double llb){

        return  llb * 2.205;

    }


    @Override
    public int compareTo(Fruit other) {
        return Integer.compare(this.price, other.price);    }
}
