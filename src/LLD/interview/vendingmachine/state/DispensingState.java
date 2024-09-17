package src.LLD.interview.vendingmachine.state;

import src.LLD.interview.vendingmachine.Product;
import src.LLD.interview.vendingmachine.VendingMachine;
import src.LLD.interview.vendingmachine.currency.Coin;
import src.LLD.interview.vendingmachine.currency.Note;
import src.LLD.interview.vendingmachine.payment.PaymentStrategy;

public class DispensingState extends VendingMachineState{
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product, int qty) {
        System.out.println("Ehh, cannot select product while dispensing. Please wait.");
    }

    @Override
    public void makePayment(PaymentStrategy paymentStrategy, String paymentDetails) {
        System.out.println("Cant make payment while dispensing.");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Cant make payment while dispensing.");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Cant make payment while dispensing.");
    }

    @Override
    public void dispenseChange(int amt) {

    }

    @Override
    public void dispenseProduct(Product product) {
        System.out.println("Dispensing product: " + product.getName());
        int updatedQty = product.getQty() - vendingMachine.getQty();
        vendingMachine.getSelectedProduct().setQty(updatedQty);
    }
}
