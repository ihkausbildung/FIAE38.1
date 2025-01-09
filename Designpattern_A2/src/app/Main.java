package app;

/*
Ziel ist es den alten Drucker über die moderne Schnittstelle anzusprechen.



OldPrinter:
Eine einfache Schnittstelle mit einer Methode print(String message), die nur Text ausgibt.


ModernPrinter:
Eine Schnittstelle mit der Methode printFormatted(String message, String font, String color), die erweiterte Formatierungsoptionen unterstützt.

OldPrinterImpl:
Implementiert die OldPrinter-Schnittstelle, druckt aber nur den Text ohne Formatierung.

PrinterAdapter:
Implementiert die ModernPrinter-Schnittstelle und verwendet intern eine Instanz von OldPrinter, um den Text zu drucken.
Ignoriert die Formatierungsoptionen font und color, da der alte Drucker diese nicht unterstützt.

Main-Methode:
Zeigt, wie der Adapter verwendet wird, um den alten Drucker über die moderne Schnittstelle anzusprechen.


 */
public class Main {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinterImpl();

        // Verwende den Adapter, um den alten Drucker mit der neuen Schnittstelle zu nutzen
        ModernPrinter modernPrinter = new PrinterAdapter(oldPrinter);

        // Verwende die moderne Schnittstelle
        modernPrinter.printFormatted("Hello, World!", "Arial", "Blue");

        // Zusätzlicher Test
        modernPrinter.printFormatted("Adapter Pattern in Java", "Times New Roman", "Red");

    }
}