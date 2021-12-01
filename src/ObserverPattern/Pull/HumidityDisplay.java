package ObserverPattern.Push;

import java.util.HashMap;

public class HumidityDisplay implements Observer, DisplayElement{
    private float humidity;

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData){
            if(arg instanceof HashMap<?,?>){
                // 这么写还不如单独把WeatherData当成一个单纯的数据类来做...
                humidity = (float) ((HashMap<?, ?>) arg).get("humidity");
                display();
            }
        }
    }

    @Override
    public void display() {
        System.out.println("HumidityDisplay:humidity is " + humidity);
    }
}
