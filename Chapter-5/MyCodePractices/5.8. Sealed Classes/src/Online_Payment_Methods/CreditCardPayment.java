package Online_Payment_Methods;

public final class CreditCardPayment  extends PaymentMethod{

    @Override
    public String getProvider(){
        return "Visa/MasterCard";
    }
}
