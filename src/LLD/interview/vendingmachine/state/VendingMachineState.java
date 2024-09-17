package src.LLD.interview.vendingmachine.state;

import src.LLD.interview.vendingmachine.Product;
import src.LLD.interview.vendingmachine.VendingMachine;
import src.LLD.interview.vendingmachine.currency.Coin;
import src.LLD.interview.vendingmachine.currency.Note;
import src.LLD.interview.vendingmachine.payment.PaymentStrategy;

public abstract class VendingMachineState {
    abstract public void selectProduct(Product product, int qty);
    abstract public void makePayment(PaymentStrategy paymentStrategy, String paymentDetails);
    abstract public void insertCoin(Coin coin);
    abstract public void insertNote(Note note);
    abstract public void dispenseChange(int amt);
    abstract public void dispenseProduct(Product product);
    public void abortAction(VendingMachine vendingMachine) {
        vendingMachine.setSelectedProduct(null);
        vendingMachine.setQty(0);
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }
}
