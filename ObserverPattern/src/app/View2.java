package app;

public class View2 implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println(getClass().getName()+ ": aktuelle Temperatur: " + temperature);
    }
}
