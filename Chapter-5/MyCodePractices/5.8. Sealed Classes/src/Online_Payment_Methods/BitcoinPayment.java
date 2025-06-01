package Online_Payment_Methods;

public final class BitcoinPayment extends  PaymentMethod{

    @Override
    public  String getProvider(){
        return "Bitcoin Network";

    }
}
