package com.desmonduz.helloWorldFx1.helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainWindowController {
    @FXML
    private TextField txtName;

    @FXML
    private Label lblGreeting;

    public void handleGreeting(){
        lblGreeting.setText("Hello," +txtName.getText());
    }

}
