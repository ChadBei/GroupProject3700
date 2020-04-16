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


public class LoginPageViewController {

   
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
   void initialize() {
      assert UsernameTF != null : "fx:id=\"UsernameTF\" was not injected: check your FXML file 'LoginPage.fxml'.";
      assert LoginBtn != null : "fx:id=\"LoginBtn\" was not injected: check your FXML file 'LoginPage.fxml'.";
      assert PasswordTF != null : "fx:id=\"PasswordTF\" was not injected: check your FXML file 'LoginPage.fxml'.";
      assert CreateAccountBtn != null : "fx:id=\"CreateAccountBtn\" was not injected: check your FXML file 'LoginPage.fxml'.";
      
   }
   
   @FXML
   public void onClickLogin(ActionEvent event){
      System.out.println("Username: " + UsernameTF.getText());
      System.out.println("Password: " + PasswordTF.getText());
   
      if (!(Main.UserDatabase.contains(new Player(UsernameTF.getText(), PasswordTF.getText())))) {
         //Show Invalid User Popup
         try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../res/Layout/PopUp.fxml"));
            Parent root2 = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Pop Up");
            stage.setScene(new Scene(root2));
      
            PopUpController popUpController= loader.getController();
            popUpController.setPopUpLabel("Invalid Login");
            popUpController.setSecondaryPopUpLabel("Login did not match a current user, try a different combination.");
            stage.show();
         }
         catch (IOException e) {
            e.printStackTrace();
         }
      }
      
      
      
   }
   
   @FXML
   public void onClickCreateAccount(ActionEvent event) {
   }
   
   
}