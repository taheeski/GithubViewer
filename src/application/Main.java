package application;
/**
* @author Taha Akbar
* @date 06/13/2024
* Main method for the GitViewer application.
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
* The MainApp class is the entry point for a JavaFX application.
* It loads the FXML file and sets up the primary stage for the application.
*/
public class Main extends Application {
   /**
    * The start method is called after the JavaFX application is initialized.
    * It sets up the primary stage with a scene loaded from an FXML file.
    *
    * @param primaryStage the primary stage for this application
    * @throws Exception if the FXML file cannot be loaded
    */
   @Override
   public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("/view/Register.fxml"));
       primaryStage.setTitle("Gitviewer App");
       primaryStage.setScene(new Scene(root, 800, 600));
       primaryStage.show();
   }
   /**
    * The main method is the entry point for the application.
    * It launches the JavaFX application by calling the launch method.
    *
    * @param args command-line arguments
    */
   public static void main(String[] args) {
       launch(args);
   }
}
