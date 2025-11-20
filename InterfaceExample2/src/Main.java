public class Main {
    public static void main(String[] args) {

        IPaymentProcessor payment=new CreditCardProcessor();

        payment.pay(10.15);


        IPaymentProcessor payment2=new CryptoProcessor();

        payment2.pay(10000.15);
    }
}