package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Text actiontarget;


    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        actiontarget.setText("Button to start was pressed!"); // Build main application here
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // ToDo
    }

}
