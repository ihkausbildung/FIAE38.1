package org.example.contacts.dao;

import org.example.contacts.model.Contact;

import java.util.List;

public class ContactFileDAO implements  ContactDAO{
    /**
     * @param newContact
     * @return true if saved
     */
    @Override
    public boolean save(Contact newContact) {
        // wir schreiben immer eine neue Datei
        return false;
    }

    /**
     * @return Result-List
     */
    @Override
    public List<Contact> findAll() {
        // Datei einlesen
        // neue Liste erzeugen
        return null;
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
    public boolean delete(int id) {
        return false;
    }
}
