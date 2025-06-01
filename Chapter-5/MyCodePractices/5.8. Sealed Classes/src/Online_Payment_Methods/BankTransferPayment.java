package Online_Payment_Methods;

public final class BankTransferPayment extends PaymentMethod{

    @Override
    public String getProvider(){
        return "Bank Wire Transfer";
    }
}
