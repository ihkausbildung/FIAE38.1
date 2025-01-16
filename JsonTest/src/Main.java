import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    // to Json
        Person p = new Person(1,"Max","max@web.de");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json  = gson.toJson(p);

        System.out.println(json);// {JSON}
   // form Json

        Gson gson2 = new Gson();
        Person p2 =  gson2.fromJson(json,Person.class);
        System.out.println(p2);




    }
}