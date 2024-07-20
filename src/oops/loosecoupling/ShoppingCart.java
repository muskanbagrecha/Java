package src.oops.loosecoupling;

public class ShoppingCart {

    public PaymentProcessor paymentProcessor;

    public ShoppingCart(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment(){
        paymentProcessor.processPayment();
    }
}
