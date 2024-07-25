package src.designpatterns.observable;

public interface ObserverInterface<T> {
    void update(ObservableInterface<T> observable);
}
