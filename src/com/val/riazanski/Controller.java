package com.val.riazanski;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller extends View {
    // fields
    @FXML private TextField tf1;
    @FXML private TextField tf2;
    @FXML private Button btnMinus = new Button();
    @FXML private Button btnPlus = new Button();
    @FXML private Button btnGo = new Button();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // actions BtnPlus
    @FXML public void onActionBtnPlus() {
        model.setOp("+");
        btnPlus.setStyle("-fx-border-color: blue");
        btnMinus.setStyle("-fx-border-color: grey");
        btnGo.setStyle("-fx-border-color: grey");
    }

    //actions BtnMinus
    @FXML public void onActionBtnMinus() {
        model.setOp("-");
        btnMinus.setStyle("-fx-border-color: red");
        btnPlus.setStyle("-fx-border-color: grey");
        btnGo.setStyle("-fx-border-color: grey");
    }

    // actions BtnGo
    @FXML public void onActionBtnGo() {
        this.go();
        btnGo.setStyle("-fx-border-color: green");
    }

    // get result
    private void go() {
        model.setNum1(tf1.getText());
        model.setNum2(tf2.getText());
        model.go();
    }
}

