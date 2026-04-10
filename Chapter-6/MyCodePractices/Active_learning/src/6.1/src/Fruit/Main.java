package Fruit;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Fruit[] fruit = new Fruit[2];

        fruit[0] = new Fruit("Mango", 3, 4.5);
        fruit[1] = new Fruit("Apple", 3, 4.5);

        Arrays.sort(fruit);

        for (Fruit f : fruit) {
            System.out.println(f.getName() + " " + f.getPrice() + " " + f.getLlb());
        }
    }
}