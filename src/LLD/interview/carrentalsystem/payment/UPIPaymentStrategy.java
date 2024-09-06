package src.LLD.interview.carrentalsystem.payment;

public class UPIPaymentStrategy implements PaymentStrategy{
    @Override
    public void makePayment(String paymentDetails, double amt) {
        System.out.println("Payment processed from UPI for amt " + amt);
    }

    @Override
    public void makeRefund(String paymentDetails, double amt) {
        System.out.println("Refund processed using UPI for amt " + amt);
    }
}
