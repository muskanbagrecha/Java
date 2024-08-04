package src.designpatterns.decorator.logger;

public class TransactionLoggingDriver {

    public static void main(String[] args){
        TransactionService transactionService = new UPITransactionService();
        transactionService = new LogTransaction(transactionService);
        transactionService.process("123456789", 100);
    }

}
