package Online_Payment_Methods;

public final class PaypalPayment extends PaymentMethod{

    @Override
    public String getProvider(){
        return "paypal";
    }
}
