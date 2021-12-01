package ObserverPattern.Push;

import java.util.ArrayList;
import java.util.HashMap;

public class WeatherData implements Observable{
    // private data -> display
    private float temperature;
    private float humidity;
    private float pressure;

    private ArrayList<Observer> observerArrayList;

    public WeatherData(){
        observerArrayList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers(Object arg) {
        for (Observer observer : observerArrayList) {
            observer.update(this, arg);
        }
    }

    public void setWeatherData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        HashMap<String, Float> weatherMap = new HashMap<>();
        weatherMap.put("temperature", this.temperature);
        weatherMap.put("humidity", this.humidity);
        weatherMap.put("pressure", this.pressure);
        notifyObservers(weatherMap);
    }
}
