package Online_Payment_Methods;

public final class DebitCardPayment extends PaymentMethod {

    @Override
    public String getProvider(){
        return "Local Bank Debit Card";
    }
}
