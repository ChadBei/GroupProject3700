package Controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ObjectClasses.Player;
import ObjectClasses.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import root.Main;


public class LoginPageController {

   
   @FXML
   private ResourceBundle resources;
   
   @FXML
   private URL location;
   
   @FXML
   private TextField UsernameTF;
   
   @FXML
   private Button LoginBtn;
   
   @FXML
   private TextField PasswordTF;
   
   @FXML
   private Button CreateAccountBtn;
   
   
   @FXML
   public void onClickLogin(ActionEvent event){
      
      
      if (!(Main.UserDatabase.contains(new Player(UsernameTF.getText(), PasswordTF.getText())))) {
         //Show Invalid User Popup
         showPopUp("Invalid Login", "Login did not match a current user, try a different combination.");
      }
      
      //Upon Successful Login, print to the console the logged in user, and set them as the current user
      System.out.println("Login Success:" + Main.UserDatabase.retrieveUserInfo(UsernameTF.getText()));
      Main.currentUser = Main.UserDatabase.retrieveUserInfo(UsernameTF.getText());
      
      
   }
   
   @FXML
   public void onClickCreateAccount(ActionEvent event) {
      try {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("../res/Layout/CreateAccountPage.fxml"));
         Parent root2 = loader.load();
         Stage stage = new Stage();
         stage.setTitle("Create Account");
         stage.setScene(new Scene(root2));
         
         stage.show();
      }
      catch (IOException e) {
         e.printStackTrace();
      }
      
   }
   
   private void showPopUp(String Label1, String Label2){
      try {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("../res/Layout/PopUp.fxml"));
         Parent root2 = loader.load();
         Stage stage = new Stage();
         stage.setTitle("Pop Up");
         stage.setScene(new Scene(root2));
      
         PopUpController popUpController= loader.getController();
         popUpController.setPopUpLabel(Label1);
         popUpController.setSecondaryPopUpLabel(Label2);
         stage.show();
      }
      catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   
}