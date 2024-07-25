package src.designpatterns.observable;

public class UserObserver implements ObserverInterface<Product>{
    private final String username;

    public UserObserver(String username) {
        this.username = username;
    }

    @Override
    public void update(ObservableInterface<Product> observable) {
        Product product = observable.getData();
        if(product!=null){
                System.out.printf("Hi, %s, %s is now in stock.%n", username, product.getProductName());

        }
    }
}
