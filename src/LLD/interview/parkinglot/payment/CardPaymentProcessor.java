package src.LLD.interview.parkinglot.payment;

public class CardPaymentProcessor implements PaymentProcessor{
    @Override
    public boolean makePayment(double amt) {
        System.out.println("Paying " + amt +" through card!");
        return true; //payment successful
    }
}
