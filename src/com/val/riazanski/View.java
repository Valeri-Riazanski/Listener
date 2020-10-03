package com.val.riazanski;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

class View implements Observer {
    //fields
    @FXML private Label LabelResult;
    @FXML private Label LabelOp;

    Model model = new Model();

    // constructors
    View() {
        model.registerObserver(this);
    }

    //methods
    @Override
    public void notification(String message) {
        if (message.equals("go")) {
            this.displayLabel(model.getResult());
        }
        else if (message.equals("op")) {
            this.displayOp(model.getOp());
        }
    }
    // display text to LabelResult
    private void displayLabel(String s){
        LabelResult.setText("Результат: " + s);
    }
    // display operation to LabelOp
    private void displayOp(String s) {
        LabelOp.setText("Операция: " + s);
    }
}
