package src.LLD.interview.vendingmachine.state;

import src.LLD.interview.vendingmachine.Product;
import src.LLD.interview.vendingmachine.VendingMachine;
import src.LLD.interview.vendingmachine.currency.Coin;
import src.LLD.interview.vendingmachine.currency.Note;
import src.LLD.interview.vendingmachine.payment.CashPaymentStrategy;
import src.LLD.interview.vendingmachine.payment.PaymentStrategy;

public class ReadyForPaymentState extends VendingMachineState{
    private VendingMachine vendingMachine;
    private int totalInsertedAmt;

    public ReadyForPaymentState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        this.totalInsertedAmt = 0;
    }

    @Override
    public void selectProduct(Product product, int qty) {
        System.out.println("Cant select product in ready for payment state. Abort to continue.");
    }

    @Override
    public void makePayment(PaymentStrategy paymentStrategy, String paymentDetails) {
        int totalPrice = vendingMachine.getSelectedProduct().getPrice() * vendingMachine.getQty();
        if(paymentStrategy instanceof CashPaymentStrategy) {
            if(totalInsertedAmt<totalPrice) {
                System.out.println("Insufficient amount");
                abortAction(vendingMachine);
                dispenseChange(totalInsertedAmt);
                totalInsertedAmt=0;
                return;
            }
            else if(totalInsertedAmt>totalPrice){
                dispenseChange(totalInsertedAmt-totalPrice);
            }
        }
        paymentStrategy.makePayment(paymentDetails, totalPrice);
        vendingMachine.setCurrentState(vendingMachine.getDispensingState());
        vendingMachine.getCurrentState().dispenseProduct(vendingMachine.getSelectedProduct());
        totalInsertedAmt=0;
    }

    @Override
    public void insertCoin(Coin coin) {
        totalInsertedAmt+=coin.getValue();
    }

    @Override
    public void insertNote(Note note) {
        totalInsertedAmt+=note.getValue();
    }

    @Override
    public void dispenseChange(int amt) {
        System.out.println("dispensing change:" + amt);
    }

    @Override
    public void dispenseProduct(Product product) {

    }

}
