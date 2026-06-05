package SpaceSystem;

public interface Habitable extends Explorable {

    double MAX_POP = 1000.0;

    void colonize(int population);

    // =====================
    // 6.1.4 — Default + Private Methods
    // =====================
    // isReadyToColonize() বাইরে দেখা যায়
    // checkPopulation() বাইরে দেখা যায় না

    default boolean isReadyToColonize(int pop) {
        return checkPopulation(pop) && checkResources();
    }

    // Private — শুধু এই interface এর ভেতরে
    private boolean checkPopulation(int pop) {
        return pop > 0 && pop <= MAX_POP;
    }

    private boolean checkResources() {
        return true;
    }
}