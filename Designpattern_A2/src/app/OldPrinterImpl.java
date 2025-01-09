package app;

public class OldPrinterImpl implements OldPrinter {
    @Override
    public void print(String message) {
        System.out.println("Old Printer: " + message);
    }
}