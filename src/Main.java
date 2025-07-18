
package src;

import javafx.application.Application;
import javafx.stage.Stage;
import src.controller.LoginController;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        LoginController.showLoginScreen(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
