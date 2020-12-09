package com.desmonduz.helloWorldFx1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class TipCalculatorController {

    private int currentTip;

    @FXML
    private TextField txtAmount;
    @FXML
    private Label lblPercentage;
    @FXML
    private Slider sldPercentage;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txtTip;
    @FXML
    private Spinner txtNumPeople;
    @FXML
    private TextField txtEachPays;
    @FXML
    public void handleSliderChanged(){
        this.currentTip = (int) Math.round(sldPercentage.getValue());
        lblPercentage.setText( "" + this.currentTip +"%");
    }
    @FXML
    public void handleCalculateTip(){
        double amount = Double.parseDouble(txtAmount.getText());
        double tip = (this.currentTip/100.0) * amount;
        double total = amount + tip;
        double eachPays = total / (int) txtNumPeople.getValue();

        txtTip.setText(""+tip);
        txtTotal.setText(""+total);
        txtEachPays.setText(""+eachPays);
    }

}
