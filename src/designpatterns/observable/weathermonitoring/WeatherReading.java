package src.designpatterns.observable.weathermonitoring;


public class WeatherReading {
    private float temperature;
    private float humidity;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public WeatherReading(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
