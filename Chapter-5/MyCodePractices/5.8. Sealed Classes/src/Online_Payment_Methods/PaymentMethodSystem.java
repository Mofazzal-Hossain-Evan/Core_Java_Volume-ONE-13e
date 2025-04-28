// ✅ একটি abstract sealed ক্লাস - শুধু নির্দিষ্ট পেমেন্ট মেথড subclass করতে পারবে
 abstract sealed class PaymentMethod permits CreditCardPayment, DebitCardPayment, PaypalPayment, BitcoinPayment, BankTransferPayment, FuturePayment {
    public abstract String getProvider();
}
