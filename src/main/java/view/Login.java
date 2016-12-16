package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * @author Luca Mozzo
 * Login diaog for the application
 */
public class Login{

    private Stage loginStage;

    /**
     * The constructor creates the stage
     */
    public Login(){
        loginStage = new Stage();
        loginStage.initModality(Modality.APPLICATION_MODAL);
    }

    /**
     * Displays the stage
     */
    public void showLoginDialog() {
        displayLogin();
        loginStage.showAndWait();
    }

    /**
     * Switches the scene to login
     */
    public void displayLogin(){
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/Login.fxml"));
        } catch (java.io.IOException ex) { return; }

        Scene loginScene = new Scene(root, 265, 164);

        loginStage.setTitle("Login");
        loginStage.setScene(loginScene);
    }

    /**
     * Switches the scene to signup
     */
    public void displaySignup(){
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/Signup.fxml"));
        } catch (java.io.IOException ex) { return; }

        Scene loginScene = new Scene(root, 303, 199);

        loginStage.setTitle("New account");
        loginStage.setScene(loginScene);
    }
}
