public class PaymentController {
    public static void main(String[] args) {
        PaymentMethod payment = new PaypalPayment();

        String response = switch (payment){
            case CreditCardPayment c -> "Paid via Credit Card: " + c.getProvider();
            case DebitCardPayment d -> "Paid via Debit Card: " + d.getProvider();
            case BitcoinPayment b -> "Paid via Bitcoin: " + b.getProvider();
            case FuturePayment fp -> "Paid via Future Method: " + fp.getProvider();
            case BankTransferPayment bt -> "Paid via Bank Transfer: " + bt.getProvider();
            case PaymentMethod p -> "Paid via PayPal: " + p.getProvider();
        };

        System.out.println(response);
    }
}
