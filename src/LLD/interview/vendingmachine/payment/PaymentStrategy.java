package src.LLD.interview.vendingmachine.payment;

public interface PaymentStrategy {
    void makePayment(String paymentDetails, int amt);
}
