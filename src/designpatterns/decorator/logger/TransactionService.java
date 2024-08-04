package src.designpatterns.decorator.logger;

public interface TransactionService {
    void process(String acctNo, double amount);
}
