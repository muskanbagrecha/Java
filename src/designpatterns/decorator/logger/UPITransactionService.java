package src.designpatterns.decorator.logger;

public class UPITransactionService implements TransactionService{
    @Override
    public void process(String acctNo, double amount) {
        //Business logic to make UPI transaction.
        return;
    }
}
