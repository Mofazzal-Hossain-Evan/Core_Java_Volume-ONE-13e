package SpaceSystem;

public interface Observable extends Explorable {
    double MAX_DIST = 100.0;

    void observe(String tool);

}
