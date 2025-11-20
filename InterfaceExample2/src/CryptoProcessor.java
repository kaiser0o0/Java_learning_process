public class CryptoProcessor implements IPaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " TL Crypto ile ödendi.");
    }
}
