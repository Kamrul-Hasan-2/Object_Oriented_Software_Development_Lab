package assingment04_221071001;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
        
        // Print the entered username and password in the console
        System.out.println("Entered Username: " + inputUsername);
        System.out.println("Entered Password: " + inputPassword);
        
        // Check credentials
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Login successful!");
            
            // Hide the login scene
            Stage stage = (Stage) button.getScene().getWindow();
            stage.close();
            
            // Load the dashboard scene
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDashboard.fxml"));
                Parent root = loader.load();
                
//                // Pass data to the dashboard controller
//                FXMLDashboardController controller = loader.getController();
//                controller.setUserData(inputUsername, inputPassword);
//                
                Stage dashboardStage = new Stage();
                dashboardStage.setScene(new Scene(root));
                dashboardStage.setTitle("Dashboard");
                dashboardStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
