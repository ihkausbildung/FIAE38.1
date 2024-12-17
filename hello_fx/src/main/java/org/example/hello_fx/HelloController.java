package org.example.hello_fx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {



    @FXML
    private TextField textField ;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(textField.getText());
    }

    @FXML
    public void initialize(){
        System.out.println("init");
    }
}