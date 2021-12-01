package ObserverPattern.Push;

import java.util.HashMap;

public class PressureDisplay implements Observer, DisplayElement{
    private float pressure;

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData){
            if(arg instanceof HashMap<?,?>){
                pressure = (float) ((HashMap<?, ?>) arg).get("pressure");
                display();
            }
        }
    }

    @Override
    public void display() {
        System.out.println("PressureDisplay:pressure is " + pressure);
    }
}
