package controller;
/**
* @author Taha Aamir
* @date 06/13/2024
* Controller responsible for viewing the github website.
*/
import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
/**
* The WebViewController class handles the logic for displaying a web page within a JavaFX WebView component.
* It loads a specified URL into the WebView when the controller is initialized.
*/
public class WebViewController {
   @FXML
   private WebView webView;
   /**
    * Initializes the controller class. This method is automatically called after the FXML file has been loaded.
    * It loads a specified URL into the WebView.
    */
   @FXML
   public void initialize() {
       WebEngine webEngine = webView.getEngine();
       webEngine.load("https://github.com/taheeski");
   }
}
