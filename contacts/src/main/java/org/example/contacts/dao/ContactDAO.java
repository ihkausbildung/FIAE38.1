package org.example.contacts.dao;

import org.example.contacts.model.Contact;

import java.util.List;

/**
 * DAO - Pattern - Data Access Object
 * alle Datenbank-Zugiffsmethoden (eines Objektes) werden in Interface festgelegt
 */
public interface ContactDAO {

    /**
     *
     * @param newContact
     * @return true if saved
     */
    boolean save(Contact newContact);

    /**
     *
     * @return Result-List
     */
    List<Contact> findAll();

    /**
     *
     * @param name eg. Max Muster
     * @return find Contacts
     */
    List<Contact> findByName(String name);

    boolean delete(int id);
}
