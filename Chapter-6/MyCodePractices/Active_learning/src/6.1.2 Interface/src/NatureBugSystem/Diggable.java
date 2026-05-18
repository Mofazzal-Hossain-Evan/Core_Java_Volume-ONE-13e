package NatureBugSystem;

public interface Diggable extends Livable{
    void dig(int depthCm);
    int MAX_DIG = 50;
}
