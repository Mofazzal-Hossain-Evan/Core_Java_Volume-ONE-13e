package NatureBugSystem;

public non-sealed interface Livable extends BugBehavior{
    void eat(String food , double grams);
    void sleep(int hours);
}
