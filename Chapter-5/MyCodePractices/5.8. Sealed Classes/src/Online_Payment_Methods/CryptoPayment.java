package Online_Payment_Methods;

public final class CryptoPayment extends FuturePayment{

    @Override
    public String getProvider(){
        return "Ethereum Blockchain";

    }
}
