package org.example.contacts.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example.contacts.dao.ContactDAO;
import org.example.contacts.dao.ContactDummyDAO;
import org.example.contacts.model.Contact;

import java.util.ArrayList;

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
        listView.getItems().remove(removeContact);




    }

    @FXML
    void onSave(ActionEvent event) {

       // listView.getItems().add();
        Contact newContact = new Contact(nameField.getText(), numberField.getText());

       boolean saved = dao.save(newContact);
       if(saved){
           listView.getItems().setAll(dao.findAll());// refresh
       }

    }

    @FXML
    public void initialize() {
        System.out.println("init");
        dao = new ContactDummyDAO();// switch to other Objekt
        listView.getItems().setAll(dao.findAll());// refresh
    }

    public void onSearch(ActionEvent actionEvent) {
        System.out.println(actionEvent);
    }
}
