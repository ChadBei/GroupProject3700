package Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import root.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BrowsePageController implements Initializable {
   
   @FXML
   private Label UserEmailDispTF;
   
   @FXML
   private Button LogOutBtn;
   
   @FXML
   private Label UsernameDispTF;
   
   @FXML
   void onLogOutClicked(ActionEvent event) {
      Main.currentUser = null;
      Stage stage1 = (Stage)LogOutBtn.getScene().getWindow();
      stage1.close();
   
      try {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("../res/Layout/LoginPage.fxml"));
         Parent root2 = loader.load();
         Stage stage = new Stage();
         stage.setTitle("Login");
         stage.setScene(new Scene(root2));
         stage.show();
      }
      catch (IOException e) {
         e.printStackTrace();
      }
      
   }
   
   public void setUsernameDispTF(String username) {
      UsernameDispTF.setText(username);
   }
   
   public void setUserEmailDispTF(String userEmail) {
      UserEmailDispTF.setText(userEmail);
   }
   
   @Override
   public void initialize(URL location, ResourceBundle resources) {
      //Display the Current User's information at the top of the screen
      setUsernameDispTF("Username: " + Main.currentUser.getUsername());
      setUserEmailDispTF("Email: " + Main.currentUser.getEmailAddress());
   }
}
