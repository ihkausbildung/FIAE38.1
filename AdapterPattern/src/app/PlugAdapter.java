package app;


/*
Der Adapter verbindet die EuropeanPlug - Schnittstelle  mit dem AmericanDevice
 */
public class PlugAdapter implements EuropeanPlug{

    private final AmericanPlug americanPlugDevice;

    public PlugAdapter(AmericanPlug americanPlugDevice) {
        this.americanPlugDevice = americanPlugDevice;
    }

    @Override
    public void connectEuropeanPlug() {
        // Verbindung wird über den amerikanischen Stecker hergestellt
        americanPlugDevice.connectAmericanPlug();
    }
}
