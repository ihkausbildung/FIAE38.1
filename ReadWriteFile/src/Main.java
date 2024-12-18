import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void readFile(String filename) throws Exception {
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    public static void writeFile(String filename) throws Exception {
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write("erste Zeile\nzweite Zeile");
        fileWriter.write(System.lineSeparator());
        fileWriter.write("noch etwas");

        fileWriter.close();
//3,Max,552523

    }


    public static void main(String[] args) {
        try {
          //  writeFile("test.txt");
          //  readFile("test.txt");


            String  line = "3,Max,5234";

            String[] arr=   line.split(",");

            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}