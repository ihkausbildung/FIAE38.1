package org.example.contacts.dao;

import org.example.contacts.model.Contact;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContactFileDAO implements ContactDAO {
    /**
     * @param newContact
     * @return true if saved
     */
    @Override
    public boolean save(Contact newContact) {
        // wir schreiben immer eine neue Datei
        try {
            newContact.setId(System.currentTimeMillis());
            FileWriter fileWriter = new FileWriter("contact.txt",true);
            fileWriter.write(newContact.getId()+","+newContact.getName()+","+newContact.getNumber()); // 3,Max Meier,32423242
            fileWriter.write(System.lineSeparator());
            fileWriter.close();//TODO verbessern

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    /**
     * @return Result-List
     */
    @Override
    public List<Contact> findAll() {
        // Datei einlesen
        // neue Liste erzeugen
        ArrayList<Contact> list = new ArrayList<>();

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
        return false;
    }
}
