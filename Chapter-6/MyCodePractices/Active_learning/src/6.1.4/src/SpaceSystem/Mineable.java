package SpaceSystem;

public interface Mineable extends Explorable {
    double MAX_RES = 500.0;
    void mine(String resource);
}
