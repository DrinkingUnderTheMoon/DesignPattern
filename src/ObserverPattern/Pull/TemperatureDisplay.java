package ObserverPattern.Push;

import java.util.HashMap;

public class TemperatureDisplay implements Observer, DisplayElement{
    private float temperature;

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData){
            if(arg instanceof HashMap<?,?>){
                // 这么写还不如单独把WeatherData当成一个单纯的数据类来做...
                temperature = (float) ((HashMap<?, ?>) arg).get("temperature");
                display();
            }
        }
    }

    @Override
    public void display() {
        System.out.println("TemperatureDisplay:temperature is " + temperature);
    }
}
