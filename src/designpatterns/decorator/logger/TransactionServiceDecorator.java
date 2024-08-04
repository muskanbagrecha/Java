package src.designpatterns.decorator.logger;

public abstract class TransactionServiceDecorator implements TransactionService{

    protected TransactionService decoratedTransactionService;

    public TransactionServiceDecorator(TransactionService decoratedTransactionService){
        this.decoratedTransactionService = decoratedTransactionService;
    }

    @Override
    public void process(String acctNo, double amount) {
        decoratedTransactionService.process(acctNo, amount);
    }
}
