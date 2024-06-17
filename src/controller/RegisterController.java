package controller;
/**
* @author Taha Akbar
* @date 06/13/2024
* Controller that allows user to register an account.
*/
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.FileWriter;
import java.io.IOException;
/**
* The RegisterController class handles the registration logic for a JavaFX application.
* It captures the username and password entered by the user and saves them to a file.
* It also transitions to the login screen upon successful registration.
*/
public class RegisterController {
   @FXML
   private TextField usernameField;
   @FXML
   private PasswordField passwordField;
   /**
    * Handles the action event triggered when the register button is pressed.
    * It saves the entered username and password to a file and switches to the login screen.
    *
    * @param event the action event triggered by the button press
    */
   @FXML
   protected void handleRegisterButtonAction(ActionEvent event) {
       try (FileWriter writer = new FileWriter("credentials.txt")) {
           writer.write(usernameField.getText() + "," + passwordField.getText());
       } catch (IOException ex) {
           ex.printStackTrace();
       }
       try {
           Stage stage = (Stage) usernameField.getScene().getWindow();
           Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
           stage.setScene(new Scene(root, 300, 200));
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
