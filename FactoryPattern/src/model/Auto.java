package model;

public class Auto implements Fahrzeug{
    @Override
    public void fahre() {
        System.out.println("Auto fährt");
    }
}
