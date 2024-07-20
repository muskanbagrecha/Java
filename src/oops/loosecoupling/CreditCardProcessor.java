package src.oops.loosecoupling;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("Credit card payment!");
    }
}
