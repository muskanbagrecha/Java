package src.designpatterns.decorator.logger;

public class LogTransaction extends TransactionServiceDecorator{

    public LogTransaction(TransactionService wrappedService){
        super(wrappedService);
    }

    @Override
    public void process(String acct, double amt){
        //call logging service here
        System.out.println("Simulate logging here");
        super.process(acct, amt);
        System.out.println("Processed UPI transaction successfully. Paid Rs." + amt + " from account: " + acct);
    }
}
