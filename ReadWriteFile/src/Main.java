import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void readFile(String filename) throws Exception {
        Scanner sc = new Scanner(new File(""));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    public static void writeFile(String filename) throws Exception {
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write("erste Zeile\nzweite Zeile"); // 3|Max Meier|32423242
        fileWriter.write(System.lineSeparator());
        fileWriter.write("noch etwas"+" ");

     //String s=   String.format("%d,%s,%s", c.getId(), name, number)

        fileWriter.close();
    //3,Max,552523

    }
   public static void writeFile2(String filename) {
       try {
           FileWriter fileWriter = new FileWriter(filename,true);
           fileWriter.write("3,Max,435345345"); // 3|Max Meier|32423242
           fileWriter.write(System.lineSeparator());
           fileWriter.close();//TODO verbessern
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }


    public static void main(String[] args) {

          //  writeFile("test.txt");
          //  readFile("test.txt");
//int[] arr1 = new int[5];
//arr1[0]=4;

            String  line = "3,Max,5234";

            String[] arr=   line.split(",");
            int id = Integer.parseInt(arr[0]);
            String name = arr[1];
            String number =arr[2];

            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);


            int id2 = (int) System.currentTimeMillis();

            String uuid =  UUID.randomUUID()+"";

        writeFile2("test2.txt");

    }
}