package model;

public class Kunde implements Cloneable{

    private String kundennummer="";//KN32234
    private String name="";
    private Adresse rechnungsAdresse;
    private Adresse lieferAdresse;

    private boolean rechnungsAdresseGleichLieferAdresse;

    public boolean isRechnungsAdresseGleichLieferAdresse() {
        return rechnungsAdresseGleichLieferAdresse;
    }

    public void setRechnungsAdresseGleichLieferAdresse(boolean rechnungsAdresseGleichLieferAdresse) {
        this.rechnungsAdresseGleichLieferAdresse = rechnungsAdresseGleichLieferAdresse;
    }

    public Kunde() {
        this("","",null);
    }

    public Kunde(String kundennummer, String name, Adresse rechnungsAdresse) {
        this.kundennummer = kundennummer;
        this.name = name;
        this.rechnungsAdresse = rechnungsAdresse;
    }

    public Kunde(String kundennummer, String name) {
        this.kundennummer = kundennummer;
        this.name = name;
    }

    public String getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(String kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getRechnungsAdresse() {
        return rechnungsAdresse;
    }

    public void setRechnungsAdresse(Adresse rechnungsAdresse) {
        this.rechnungsAdresse = rechnungsAdresse;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kundennummer='" + kundennummer + '\'' +
                ", name='" + name + '\'' +
                ", adresse=" + rechnungsAdresse +
                '}';
    }

    public Adresse getLieferAdresse() {
        return lieferAdresse;
    }

    public void setLieferAdresse(Adresse lieferAdresse) {
        this.lieferAdresse = lieferAdresse;
    }
}
