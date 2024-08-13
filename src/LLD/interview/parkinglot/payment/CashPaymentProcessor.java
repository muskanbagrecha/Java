package src.LLD.interview.parkinglot.payment;

public class CashPaymentProcessor implements PaymentProcessor{
    @Override
    public boolean makePayment(double amt) {
        System.out.println("Paying " + amt + " through cash!!");
        return true; //payment successful.
    }
}
