package PetShopSystem;

public interface Cuddlable extends Trainable {

    double MAX_CUDDLE = 60.0;

    void cuddle(int minutes);
}