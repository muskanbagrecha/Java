package src.designpatterns.observable;

import java.util.ArrayList;
import java.util.List;

public class ProductObservable implements ObservableInterface<Product>{

    private final Product product;
    private List<ObserverInterface<Product>> observers;

    public ProductObservable(Product product) {
        this.product = product;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(ObserverInterface<Product> observer) {
        if(observer!=null){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(ObserverInterface<Product> observer) {
        if(observer!=null){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(ObserverInterface<Product> observer : observers){
            observer.update(this);
        }
    }

    public void setData(boolean inStock) { //this need not be in interface.
        product.setInStock(inStock);
        if(inStock){
            notifyObservers();
        }
    }

    @Override
    public Product getData() {
        return product;
    }
}
