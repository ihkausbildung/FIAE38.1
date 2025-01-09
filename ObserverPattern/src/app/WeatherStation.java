package app;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        for(Observer o : observers){
            o.update(temperature);
        }

    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();// benachrichtigt alle Observer(Views)
        // notifyObservers() könnte auch an einem anderen Ort aufgerufen werden

    }
}
