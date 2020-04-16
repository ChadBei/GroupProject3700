package root;

import ObjectClasses.Advertiser;
import ObjectClasses.Database;
import ObjectClasses.Player;
import ObjectClasses.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static Database UserDatabase;
    public static User currentUser;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../res/Layout/LoginPage.fxml"));
        primaryStage.setTitle("Group Project");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        UserDatabase = new Database();
        UserDatabase.add(new Player("TestUser", "testPass"));
        
        
        launch(args);
    }
}
