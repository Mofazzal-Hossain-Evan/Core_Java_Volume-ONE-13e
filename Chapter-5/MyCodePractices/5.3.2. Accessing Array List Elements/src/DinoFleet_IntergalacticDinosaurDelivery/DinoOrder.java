package DinoFleet_IntergalacticDinosaurDelivery;

public class DinoOrder {

    private String planet, dinosaur;
    private int quantity;

    public DinoOrder(String planet, String dinosaur, int quantity) {
        this.planet = planet;
        this.dinosaur = dinosaur;
        this.quantity = quantity;
    }

    public String getPlanet() {
        return planet;
    }

    public String getDinosaur() {
        return dinosaur;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updateQuantity(int newQty){
        this.quantity = newQty;
    }

    @Override
    public String toString() {
        return "DinoOrder{" +
                "planet='" + planet + '\'' +
                ", dinosaur='" + dinosaur + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
