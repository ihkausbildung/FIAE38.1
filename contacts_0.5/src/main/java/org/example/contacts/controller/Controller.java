package org.example.contacts.controller;

import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import org.example.contacts.dao.ContactDAO;
import org.example.contacts.dao.ContactDummyDAO;
import org.example.contacts.dao.ContactFileDAO;
import org.example.contacts.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private ContactDAO dao;

    public TextField searchField;
    @FXML
    private ListView<Contact> listView;

    @FXML
    private TextField nameField;

    @FXML
    private TextField numberField;

    @FXML
    void onDelete(ActionEvent event) {
        //TODO
        Contact removeContact = listView.getSelectionModel().getSelectedItem();
        //listView.getItems().remove(removeContact);
        boolean deleted = dao.delete(removeContact.getId());
        if (deleted) {
            listView.getItems().setAll(dao.findAll());// refresh
        }

    }

    @FXML
    void onSave(ActionEvent event) {

        // listView.getItems().add();
        Contact newContact = new Contact(nameField.getText(), numberField.getText());

        boolean saved = dao.save(newContact);
        if (saved) {
            System.out.println("saved");
            listView.getItems().setAll(dao.findAll());// refresh
        }

    }

    @FXML
    public void initialize() {
        System.out.println("init");

       // dao = new ContactDummyDAO();// switch to other Objekt
        dao = new ContactFileDAO();
        listView.getItems().setAll(dao.findAll());// refresh



    }

    // TODO Text change -> ohne Button-Event
    public void onSearch(ActionEvent actionEvent) {
        System.out.println(actionEvent);
        List<Contact> findList = dao.findByName(searchField.getText());
        listView.getItems().setAll(findList);// refresh
    }

    public void onKey(KeyEvent keyEvent) {
       // System.out.println(keyEvent);
        listView.getItems().setAll(dao.findByName(searchField.getText()));
    }
}
