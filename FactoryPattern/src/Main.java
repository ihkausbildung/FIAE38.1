import model.Fahrzeug;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Fahrzeug fahrzeug = FahrzeugFactory.create("fahrrad");
        fahrzeug.fahre();


        LocalDate date = LocalDate.of(2000,12,1);

        System.out.println(date.plusDays(4));

    }
}