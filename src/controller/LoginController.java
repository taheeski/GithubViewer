package controller;
/**
* @author Taha Akbar
* @date 06/13/2024
* Controller responsible for allowing the user to login with their registered information.
*/
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
* The LoginController class handles the login logic for a JavaFX application.
* It verifies the entered username and password against stored credentials and transitions to a new scene upon successful login.
*/
public class LoginController {
   @FXML
   private TextField usernameField;
   @FXML
   private PasswordField passwordField;
   /**
    * Handles the action event triggered when the login button is pressed.
    * It reads stored credentials from a file, verifies the entered username and password, and loads a new scene upon successful login.
    *
    * @param event the action event triggered by the button press
    */
   @FXML
   protected void handleLoginButtonAction(ActionEvent event) {
       try (BufferedReader reader = new BufferedReader(new FileReader("credentials.txt"))) {
           String[] credentials = reader.readLine().split(",");
           if (usernameField.getText().equals(credentials[0]) && passwordField.getText().equals(credentials[1])) {
               Stage stage = (Stage) usernameField.getScene().getWindow();
               Parent root = FXMLLoader.load(getClass().getResource("/view/WebView.fxml"));
               stage.setScene(new Scene(root, 800, 600));
           }
       } catch (IOException ex) {
           ex.printStackTrace();
       }
   }
}

