import app.View1;
import app.View2;
import app.WeatherStation;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WeatherStation station = new WeatherStation();

        View1 view1 = new View1();
        View2 view2 = new View2();

        //Observer registrieren
        station.addObserver(view1);
        station.addObserver(view2);


        // Wetterdaten ändern sich

        Random r = new Random();

        for (int i = 0; i < 10 ; i++) {
            Thread.sleep(100);
            station.setTemperature(r.nextFloat(-10,30));
        }



    }
}