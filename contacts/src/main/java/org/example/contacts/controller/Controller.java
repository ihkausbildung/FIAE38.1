package org.example.contacts.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example.contacts.model.Contact;

import java.util.ArrayList;

public class Controller {


    @FXML
    private ListView<Contact> listView;

    @FXML
    private TextField nameField;

    @FXML
    private TextField numberField;

    @FXML
    void onDelete(ActionEvent event) {
        //TODO
    }

    @FXML
    void onSave(ActionEvent event) {
        //TODO
    }
    @FXML
    public void initialize(){
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ina","43423423423"));
        contacts.add(new Contact("Max","474745"));

        listView.getItems().setAll(contacts);
    }

}
