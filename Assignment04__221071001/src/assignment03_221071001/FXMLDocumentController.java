package assignment03_221071001;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Kamrul
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button button;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Hardcoded credentials
        String correctUsername = "kamrul@gmail.com";
        String correctPassword = "123@123";
        
        // Get user input
        String inputUsername = username.getText();
        String inputPassword = password.getText();
        
        // Check credentials
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
