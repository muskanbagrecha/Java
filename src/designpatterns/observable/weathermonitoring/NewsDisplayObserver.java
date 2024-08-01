package src.designpatterns.observable.weathermonitoring;

import src.designpatterns.observable.ObservableInterface;
import src.designpatterns.observable.ObserverInterface;

public class NewsDisplayObserver implements ObserverInterface<WeatherReading> {
    @Override
    public void update(ObservableInterface<WeatherReading> observable) {
        System.out.println("Current temperature is: " + observable.getData().getTemperature());
        System.out.println("Current humidity is: " + observable.getData().getHumidity());
    }
}
