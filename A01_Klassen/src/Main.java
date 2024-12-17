import model.Adresse;
import model.Kunde;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void test(Object obj){
        if(obj instanceof Cloneable){
            System.out.println("mache ine Kopie "+obj);
        }else{
            System.out.println("nicht geeignet zum Kopieren"+obj);
        }
    }


    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Kunde k1 = new Kunde("KN123","Max Meier",new Adresse("Berlin","Dorfstr. 3","23422"));
        System.out.println(k1);

        k1.setRechnungsAdresse(new Adresse("Hamburg","Teststr. 5","33354"));
        System.out.println(k1.getRechnungsAdresse().getPlz());
        Adresse a1 =new Adresse("Hamburg","Teststr. 5","33354");

        test(a1);



    }
}