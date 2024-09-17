package src.LLD.interview.vendingmachine.state;

import src.LLD.interview.vendingmachine.Product;
import src.LLD.interview.vendingmachine.VendingMachine;
import src.LLD.interview.vendingmachine.currency.Coin;
import src.LLD.interview.vendingmachine.currency.Note;
import src.LLD.interview.vendingmachine.payment.PaymentStrategy;

public class IdleState extends VendingMachineState{
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product, int qty) {
        if(qty>product.getQty()){
            System.out.println("Insufficient stock.");
            return;
        }
        vendingMachine.setSelectedProduct(product);
        vendingMachine.setQty(qty);
        vendingMachine.setCurrentState(vendingMachine.getReadyForPaymentState());
    }

    @Override
    public void makePayment(PaymentStrategy paymentStrategy, String paymentDetails) {
        System.out.println("cant make payment in idle state");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Cant insert coin in idle state");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("cant insert note in idle state");
    }

    @Override
    public void dispenseChange(int amt) {

    }

    @Override
    public void dispenseProduct(Product product) {

    }


}
