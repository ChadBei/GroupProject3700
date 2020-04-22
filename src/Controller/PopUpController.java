package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import root.Main;


public class PopUpController  {
   
   @FXML
   private Label popUpLabel;
   
   @FXML
   private Label secondaryLabel;
   
   
   
   @FXML
   public Button confirmButton;
   
   @FXML
   void onConfirmClicked(ActionEvent event) {
      
      //Reset the Current User
      Main.currentUser = null;
   
      Node source = (Node)  event.getSource();
      Stage root  = (Stage) source.getScene().getWindow();
      root.close();
      
      Stage stage = (Stage) confirmButton.getScene().getWindow();
      stage.close();
      
   }
   
   public void setPopUpLabel(String label){
      popUpLabel.setText(label);
   }
   
   public void setSecondaryPopUpLabel(String label){
      secondaryLabel.setText(label);
   }
   
   
}