
package src.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {
    public static void showLoginScreen(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(LoginController.class.getResource("/ui/Login.fxml"));
        stage.setTitle("CollabBoard - Login");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
