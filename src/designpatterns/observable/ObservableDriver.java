package src.designpatterns.observable;

public class ObservableDriver {
    public static void iphoneObservable(){
        Product product = new Product(1, "iPhone 14");
        ProductObservable iphoneObservable = new ProductObservable(product);
        ObserverInterface<Product> observer1 = new UserObserver("Muskan");
        ObserverInterface<Product> observer2 = new UserObserver("Adi");
        iphoneObservable.addObserver(observer1);
        iphoneObservable.addObserver(observer2);
        iphoneObservable.setData(true);
        iphoneObservable.setData((false));
        iphoneObservable.setData(true);
    }
}
