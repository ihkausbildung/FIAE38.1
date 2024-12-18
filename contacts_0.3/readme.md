# Contacts
# Version 0.3

# Features
* nur Lokal
* alle Kontakte anzeigen
* Kontakte speichern

# Plan 
* Schichten > Pakete und Interfaces


# Todo
* Benutzermeldung
* Search mit Teilstring und TextField (lowercase)

# Aufgabe
* erstmal nur für save und findAll
## zweite ContactDAO Implementierung
* ContactFileDAO
 
    ContactFileDAO soll alle Methoden implementieren
* bei save und delete kann die ganze Datei neu geschrieben werden
* alle Methoden (auch Hilfsmethoden) können in ContactFileDAO stehen
### Format/ Struktur für Text-File
> für jede Zeile
> Trennzeichen z.B. 
> 2,Max,35233 oder 
> 2|Max|35233
> 
>           String  line = "3,Max,5234";
            String[] arr=   line.split(",");

            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
> 

