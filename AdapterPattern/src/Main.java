import app.AmericanPlug;
import app.AmericanPlugDevice;
import app.EuropeanPlug;
import app.PlugAdapter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AmericanPlug device = new AmericanPlugDevice();

        EuropeanPlug adapter = new PlugAdapter(device);
        adapter.connectEuropeanPlug();
    }
}