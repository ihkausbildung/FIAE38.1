package app;

class PrinterAdapter implements ModernPrinter {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void printFormatted(String message, String font, String color) {
        System.out.println("Formatting ignored. Using Old Printer...");
        oldPrinter.print(message);
    }
}
