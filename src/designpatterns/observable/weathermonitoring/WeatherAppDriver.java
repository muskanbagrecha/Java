package src.designpatterns.observable.weathermonitoring;

public class WeatherAppDriver {

    public static void weatherAppDriver(){
        WeatherObserverable weatherObserverable = new WeatherObserverable();
        weatherObserverable.setData(new WeatherReading(10, 20));
        NewsDisplayObserver newsDisplayObserver = new NewsDisplayObserver();
        weatherObserverable.addObserver(newsDisplayObserver);
        WeatherStatisticsObserver weatherStatisticsObserver = new WeatherStatisticsObserver();
        weatherObserverable.addObserver(weatherStatisticsObserver);
        weatherObserverable.setData(new WeatherReading(20, 40));
    }

}
