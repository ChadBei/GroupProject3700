package Controller;

import ObjectClasses.Advertiser;
import ObjectClasses.GameDeveloper;
import ObjectClasses.Player;
import ObjectClasses.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import root.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CreateAccountPageController {
   
   @FXML
   private ChoiceBox<String> AccountTypeChoiceBox;
   
   @FXML
   private TextField UsernameTF;
   
   @FXML
   private TextField EmailTF;
   
   @FXML
   private TextField PasswordTF;
   
   @FXML
   private Button CancelButton;
   
   @FXML
   private Button ConfirmButton;
   
   private User AccountSelection;
   
   @FXML
   void onConfirmClick(ActionEvent event) {
      String username = UsernameTF.getText();
      String password = PasswordTF.getText();
      String email = EmailTF.getText();
      
      getAccountTypeSelection();
      
      if (!(username.equals("") || password.equals("") || email.equals("") || AccountSelection == null))
      {
         AccountSelection.setUsername(UsernameTF.getText());
         AccountSelection.setPassword(PasswordTF.getText());
         AccountSelection.setEmailAddress(EmailTF.getText());
         
         //Enter new User in Database
         Main.UserDatabase.addUser(AccountSelection);
   
         //Close Window
         Stage stage = (Stage) ConfirmButton.getScene().getWindow();
         stage.close();
      }else{
         try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../res/Layout/PopUp.fxml"));
            Parent root2 = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Error");
            stage.setScene(new Scene(root2));
      
            PopUpController popUpController= loader.getController();
            popUpController.setPopUpLabel("Try Again");
            popUpController.setSecondaryPopUpLabel("Please complete all fields to create an account.");
            stage.show();
         }
         catch (IOException e) {
            e.printStackTrace();
         }
      }
      
      
   }
   
   @FXML
   void OnCancelClick(ActionEvent event) {
      Stage stage = (Stage) CancelButton.getScene().getWindow();
      stage.close();
   }
   
   @FXML
   public void initialize() {
      //Add Account Types to Choice drop down
      AccountTypeChoiceBox.getItems().clear();
      AccountTypeChoiceBox.getItems().addAll("Player", "Advertiser", "Game Developer");
      
   }
   
   private void getAccountTypeSelection(){
      String nameSelected = AccountTypeChoiceBox.getValue();
      
      //If no selection
      if (nameSelected == null)
         return;
      
       if (nameSelected.equals("Player"))
          AccountSelection = new Player();
       
       if (nameSelected.equals("Game Developer"))
          AccountSelection = new GameDeveloper();
       
       if (nameSelected.equals("Advertiser"))
          AccountSelection = new Advertiser();

       
   }
}
