import model.Auto;
import model.Fahrrad;
import model.Fahrzeug;

public class FahrzeugFactory {


    //private Constructor

    private FahrzeugFactory(){

    }

    public static Fahrzeug create(String typ){
        if(typ.equals("auto")){
            return new Auto();
        } else if (typ.equals("fahrrad")) {
            return new Fahrrad();
        }


        return null;
    }
}
