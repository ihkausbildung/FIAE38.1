package org.example.contacts.dao;

import org.example.contacts.model.Contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ContactFileDAO implements ContactDAO {

    public static final String FILE_NAME = "contact.txt";

    /**
     * @param newContact
     * @return true if saved
     */
    @Override
    public boolean save(Contact newContact) {
        // wir schreiben immer eine neue Datei
        try {
            newContact.setId(System.currentTimeMillis());
            FileWriter fileWriter = new FileWriter(FILE_NAME, true);
            fileWriter.write(newContact.getId() + "," + newContact.getName() + "," + newContact.getNumber()); // 3,Max Meier,32423242
            fileWriter.write(System.lineSeparator());
            fileWriter.close();//TODO verbessern

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    /**
     * @return Result-List
     */
    @Override
    public List<Contact> findAll() {
        // Datei einlesen
        // neue Liste erzeugen
        ArrayList<Contact> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(FILE_NAME));

            while (sc.hasNext()) {
                String line = sc.nextLine();  //1,Max,4353453
                String[] lineArr = line.split(",");//[1,Max,453534]
                long id = Long.parseLong(lineArr[0]);// String to Long
                String name = lineArr[1];
                String number = lineArr[2];
                list.add(new Contact(id, name, number));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    /**
     * @param name eg. Max Muster
     * @return find Contacts
     */
    @Override
    public List<Contact> findByName(String name) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public boolean delete(long id) {
        List<Contact> listOrg = findAll();//aus Datei lesen
        boolean removed=  listOrg.removeIf(contact -> contact.getId() == id);
        if(!removed){
            return false;
        }
        // Datei neu schreiben
        try {
            FileWriter fw = new FileWriter(FILE_NAME);
            for (Contact c: listOrg){
                fw.write(c.getId() + "," + c.getName() + "," + c.getNumber()); // 3,Max Meier,32423242
                fw.write(System.lineSeparator());
            }
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
