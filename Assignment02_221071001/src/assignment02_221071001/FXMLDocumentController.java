/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package assignment02_221071001;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Kamrul
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button exit;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You Clicked Button1");
        label.setText("Button 1");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction1(ActionEvent event) {
         System.out.println("You Clicked Button2");
        label.setText("Button 2");
    }

    @FXML
    private void handleButtonAction2(ActionEvent event) {
         System.out.println("You Clicked Button3");
        label.setText("Button 3");  
    }

    @FXML
    private void handleButtonAction3(ActionEvent event) {
        System.out.println("You Clicked Button4");
        label.setText("Button 4");
    }

    @FXML
    private void handleButtonAction5(ActionEvent event) {
         System.out.println("Exited");
        label.setText("Exiting");
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }
    
}
