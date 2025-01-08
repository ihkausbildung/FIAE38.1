import factory.ListFactory;
import singleton.ConfigurationManager;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // ArrayList<String> li = (ArrayList<String>) ListFactory.create("v");


       List<String> list =  ListFactory.create("v");

       if(list instanceof ArrayList){
           System.out.println("ArrayList");
       }


       //Singleton

        ConfigurationManager manager = ConfigurationManager.getInstance();
       manager.setProperty("höhe","100px");
       manager.printAllProperties();


    }
}