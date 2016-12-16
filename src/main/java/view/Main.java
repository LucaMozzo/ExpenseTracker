package view;

import controller.LoginController;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Luca Mozzo
 * view.Main class of the application
 */
public class Main extends Application{
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        //start login on a different thread
        Login loginDialog = new Login();
        LoginController.setView(loginDialog);
        loginDialog.showLoginDialog();

        //primaryStage.show();
    }
}
