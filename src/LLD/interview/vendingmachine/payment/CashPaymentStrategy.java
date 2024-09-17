package src.LLD.interview.vendingmachine.payment;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void makePayment(String paymentDetails, int amt) {
        System.out.println("Payment successful.");
    }
}
