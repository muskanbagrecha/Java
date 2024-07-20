package src.oops.tightcoupling;

public class ShoppingCart {
    public CreditCardProcessor creditCardProcessor;

    public void makePayment(){
        creditCardProcessor.processCreditCardPayments(); //this means shopping cart is tightly coupled with credit card payment only.
    }
}
