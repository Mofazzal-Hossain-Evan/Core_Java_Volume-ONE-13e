package MasterChef;

public sealed interface Sweet extends TasteStyle permits PastryChef {
    default String getTaste() {
        return "Sweet";
    }
}
