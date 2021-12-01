package ObserverPattern.Push;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();
        PressureDisplay pressureDisplay = new PressureDisplay();

        weatherData.registerObserver(temperatureDisplay);
        weatherData.registerObserver(humidityDisplay);
        weatherData.registerObserver(pressureDisplay);

        weatherData.setWeatherData(16.0f,99.0f,1013.6f);  // 11.29
        weatherData.setWeatherData(15.8f,41.0f,1017.2f);  // 11.30
        weatherData.setWeatherData(13.0f,42.0f,1018.1f);  // 12.01

    }
}
