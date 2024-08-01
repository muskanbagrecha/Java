package src.designpatterns.observable.weathermonitoring;

import src.designpatterns.observable.ObservableInterface;
import src.designpatterns.observable.ObserverInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherObserverable implements ObservableInterface<WeatherReading> {

    WeatherReading weatherReading;

    private List<ObserverInterface> observers;

    public WeatherObserverable(){
        observers=new ArrayList<>();
    }

    @Override
    public void addObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(ObserverInterface observer : observers){
            observer.update(this);
        }
    }

    public void setData(WeatherReading newWeatherReading){
        if(!Objects.deepEquals(weatherReading, newWeatherReading)){
            this.weatherReading = newWeatherReading;
            notifyObservers();
        }
    }

    @Override
    public WeatherReading getData() {
        return this.weatherReading;
    }
}
