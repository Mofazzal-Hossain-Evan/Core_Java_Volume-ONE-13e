package stockmonitor;

public class TechStock extends Stock{
    private String sector;

    public TechStock(String symbol, double price, String sector) {
        super(symbol, price);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    @Override
    public String toString() {
        return super.toString() +"T (Tech, Sector: " + sector + ")";
    }
}
