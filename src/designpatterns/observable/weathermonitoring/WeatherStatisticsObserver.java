package src.designpatterns.observable.weathermonitoring;

import src.designpatterns.observable.ObservableInterface;
import src.designpatterns.observable.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class WeatherStatisticsObserver implements ObserverInterface<WeatherReading> {

    List<Float> threeDaysTemperature;
    List<Float> threeDaysHumidity;

    public WeatherStatisticsObserver(){
        threeDaysTemperature = new ArrayList<>();
        threeDaysHumidity = new ArrayList<>();
    }

    @Override
    public void update(ObservableInterface<WeatherReading> observable) {
        updateTemperature(observable.getData().getTemperature());
        updateHumidity(observable.getData().getHumidity());

        if(threeDaysHumidity.size()>3){
            threeDaysHumidity.remove(0);
        }
        threeDaysHumidity.add(observable.getData().getHumidity());


    }

    private void updateTemperature(float temp){
        if(threeDaysTemperature.size()>3){
            threeDaysTemperature.remove(0);
        }
        threeDaysTemperature.add(temp);
        float tempAvg = 0;
        for(float curr : threeDaysTemperature){
            tempAvg+=curr;
        }
        tempAvg/=threeDaysTemperature.size();
        System.out.println("Average temperature" + tempAvg);
    }

    private void updateHumidity(float humidity) {
        if (threeDaysHumidity.size() > 3) {
            threeDaysHumidity.remove(0);
        }
        threeDaysHumidity.add(humidity);
        float humidityAvg = 0;
        for (float curr : threeDaysHumidity) {
            humidityAvg += curr;
        }
        humidityAvg /= threeDaysHumidity.size();
        System.out.println("Average humidity" + humidityAvg);
    }
}
