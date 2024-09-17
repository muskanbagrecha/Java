package src.LLD.interview.vendingmachine;

import src.LLD.interview.vendingmachine.currency.Coin;
import src.LLD.interview.vendingmachine.currency.Note;
import src.LLD.interview.vendingmachine.payment.PaymentStrategy;
import src.LLD.interview.vendingmachine.state.DispensingState;
import src.LLD.interview.vendingmachine.state.IdleState;
import src.LLD.interview.vendingmachine.state.ReadyForPaymentState;
import src.LLD.interview.vendingmachine.state.VendingMachineState;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private static VendingMachine vendingMachine;
    private Map<String, Product> products;
    private VendingMachineState currentState;
    private ReadyForPaymentState readyForPaymentState;
    private IdleState idleState;
    private DispensingState dispensingState;
    private Product selectedProduct;
    private int qty;

    private VendingMachine() {
        this.products = new HashMap<>();
        this.readyForPaymentState = new ReadyForPaymentState(this);
        this.idleState = new IdleState(this);
        this.dispensingState = new DispensingState(this);
        this.currentState = idleState;
        this.selectedProduct = null;
        this.qty = 0;
    }

    public static VendingMachine getInstance(){
        if(vendingMachine==null){
            synchronized (VendingMachine.class){
                if(vendingMachine==null){
                    vendingMachine = new VendingMachine();
                }
            }
        }
        return vendingMachine;
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public void selectProduct(String productId, int qty){
        Product product = products.get(productId);
        currentState.selectProduct(product, qty);
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public ReadyForPaymentState getReadyForPaymentState() {
        return readyForPaymentState;
    }


    public IdleState getIdleState() {
        return idleState;
    }


    public DispensingState getDispensingState() {
        return dispensingState;
    }

    public void addProduct(Product product){
        products.put(product.getId(), product);
    }

    public void insertCoin(Coin coin){
        currentState.insertCoin(coin);
    }

    public void insertNote(Note note){
        currentState.insertNote(note);
    }

    public void makePayment(PaymentStrategy paymentStrategy, String paymentdetails){
        currentState.makePayment(paymentStrategy, paymentdetails);
    }
}
