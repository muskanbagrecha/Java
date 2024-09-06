package src.LLD.interview.carrentalsystem.payment;

public interface PaymentStrategy {
    public void makePayment(String paymentDetails, double amt);
    public void makeRefund(String paymentDetails, double amt);
}
