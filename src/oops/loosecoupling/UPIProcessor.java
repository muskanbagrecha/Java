package src.oops.loosecoupling;

public class UPIProcessor implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("UPI payment!");
    }
}
