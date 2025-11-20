public class CreditCardProcessor implements IPaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " TL Kredi Kartı ile ödendi.");
    }
}
