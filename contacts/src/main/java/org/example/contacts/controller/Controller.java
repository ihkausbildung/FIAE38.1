package org.example.contacts.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example.contacts.model.Contact;

import java.util.ArrayList;

public class Controller {


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

        listView.getItems().add(new Contact(nameField.getText(), numberField.getText()));



    }

    @FXML
    public void initialize() {
        System.out.println("init");
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ina", "43423423423"));
        contacts.add(new Contact("Max", "474745"));
        listView.getItems().setAll(contacts);
/*


        ObservableList<Contact> oList = FXCollections.observableArrayList();
        listView.setItems(oList);
*/
    }

    public void onSearch(ActionEvent actionEvent) {
        System.out.println(actionEvent);
    }
}
