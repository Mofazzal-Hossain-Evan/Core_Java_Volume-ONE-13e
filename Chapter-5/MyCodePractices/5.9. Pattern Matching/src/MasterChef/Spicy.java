package MasterChef;

public sealed interface Spicy extends TasteStyle permits HeadChef {
    default String getTaste() {
        return "Spicy";
    }
}
