import app.BorderDecorator;
import app.PlainText;
import app.Text;
import app.UpperCaseDecorator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Text text = new PlainText("Hallo");

        System.out.println(text.render());//Hallo

        text = new BorderDecorator(text);
        System.out.println(text.render());//***Hallo***

        text = new UpperCaseDecorator(text);

        System.out.println(text.render());//***HALLO***




/*
        BorderDecorator bd = new BorderDecorator( new PlainText("Guten Tag"));
        System.out.println(bd.render());


        UpperCaseDecorator ud =  new UpperCaseDecorator(  new BorderDecorator( new PlainText("Guten Tag")));
        System.out.println(ud.render());


*/

        // Java Beispiel
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("test.txt"))); //Erzeugen eines effizienten Writers für Textdateien
        writer.write("Hallo");
        writer.newLine();
        writer.close();


    }
}