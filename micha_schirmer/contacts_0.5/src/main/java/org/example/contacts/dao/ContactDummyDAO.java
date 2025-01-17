package org.example.contacts.dao;

import org.example.contacts.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactDummyDAO implements ContactDAO {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static int count;


    static {  // Dummy List contacts
        contacts.add(new Contact(count++, "Max", "23423"));
        contacts.add(new Contact(count++, "Ina", "5234234"));
    }

    /**
     * @param newContact
     * @return true if saved
     */
    @Override
    public boolean save(Contact newContact) {
        //Aufgabe vor dem Speichern eine neue ID hinzufügen
        newContact.setId(count++);
        return contacts.add(newContact);

    }

    /**
     * @return Result-List
     */
    @Override
    public List<Contact> findAll() {
        return contacts;
    }

    /**
     * @param name eg. Max Muster
     * @return find Contact
     */
    @Override
    public List<Contact> findByName(String name) {
        ArrayList<Contact> resultList = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {// TODO startWith
                resultList.add(c);
            }

        }
        return resultList;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public boolean delete(long id) {
        for (Contact c : contacts) {
            if (c.getId() == id) {
                return contacts.remove(c);
            }

        }
        return false;
    }
}
