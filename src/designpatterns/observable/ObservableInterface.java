package src.designpatterns.observable;

public interface ObservableInterface<T> {
    void addObserver(ObserverInterface<T> observer);
    void removeObserver(ObserverInterface<T> observer);
    void notifyObservers();
    T getData();
}