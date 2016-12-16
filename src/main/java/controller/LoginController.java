package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import view.Login;

import java.awt.event.ActionEvent;

/**
 * @author Luca Mozzo
 * Controller for the login and signup form
 */
public final class LoginController {

    protected static Login view;

    /**
     * Change the view reference
     * @param newView the login dialog reference
     */
    public static void setView(Login newView){
        view = newView;
    }

    @FXML
    protected void handleSwitchToSignup(){
        view.displaySignup();
    }

    @FXML
    protected void handleSwitchToLogin(){
        view.displayLogin();
    }
}
