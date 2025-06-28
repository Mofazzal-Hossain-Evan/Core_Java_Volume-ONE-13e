package stockmonitor;

public class FinanceStock extends Stock{
    private String institutionType;

    public FinanceStock(String symbol, double price, String institutionType) {
        super(symbol, price);
        this.institutionType = institutionType;
    }

    public String getInstitutionType() {
        return institutionType;
    }

    @Override
    public String toString() {
        return super.toString() + " (Finance, Type: " + institutionType + ")";
    }
}
