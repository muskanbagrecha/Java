package src.LLD.interview.vendingmachine;

import src.LLD.interview.vendingmachine.currency.Coin;
import src.LLD.interview.vendingmachine.currency.Note;
import src.LLD.interview.vendingmachine.payment.CashPaymentStrategy;

public class VendingMachineDemo {
    public static void main(String [] args){
        VendingMachine vendingMachine = VendingMachine.getInstance();
        Product coke = new Product("1", "Coke", 5, 20);
        Product lays = new Product("2", "Lays", 3, 10);
        vendingMachine.addProduct(coke);
        vendingMachine.addProduct(lays);
        vendingMachine.selectProduct("1", 2);
        vendingMachine.insertNote(Note.FIFTY);
        vendingMachine.insertCoin(Coin.TWENTY);
        vendingMachine.makePayment(new CashPaymentStrategy(), "cash");
    }
}
