package PetShopSystem;

public non-sealed interface Trainable
        extends PetBehavior {

    void train(String trick);
    void feed(String food);

    // CharSequence subSequence idea
    // interface নিজেকেই return type হিসেবে ব্যবহার করছে
    Trainable getJuniorVersion();
}