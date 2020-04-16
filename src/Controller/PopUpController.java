package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PopUpController implements Initializable {
   
   @FXML
   private Label popUpLabel;
   
   @FXML
   private Label secondaryLabel;
   
   
   
   @FXML
   private Button confirmButton;
   
   @FXML
   void onConfirmClicked(ActionEvent event) {
      Stage stage = (Stage) confirmButton.getScene().getWindow();
      stage.close();
   }
   
   public void setPopUpLabel(String label){
      popUpLabel.setText(label);
   }
   
   public void setSecondaryPopUpLabel(String label){
      secondaryLabel.setText(label);
   }
   
   @Override
   public void initialize(URL location, ResourceBundle resources) {
   
   }
   
}