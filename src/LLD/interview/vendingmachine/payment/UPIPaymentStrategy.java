package src.LLD.interview.vendingmachine.payment;

public class UPIPaymentStrategy implements PaymentStrategy{
    @Override
    public void makePayment(String paymentDetails, int amt) {
        System.out.println("Process payment through card");
    }
}
