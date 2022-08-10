package client.controller;

import client.ClientAppInitializer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane root;
    public AnchorPane loginForm;
    public PasswordField txtPassword;
    public TextField txtUserName;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equalsIgnoreCase("malith") && txtPassword.getText().
                equalsIgnoreCase("1234")) {
            new Alert(Alert.AlertType.CONFIRMATION, "Welcome Malith ").show();
            setUi("Client1Form");

        }
        else if (txtUserName.getText().equalsIgnoreCase("navod") && txtPassword.getText().
                equalsIgnoreCase("1235")) {
            new Alert(Alert.AlertType.CONFIRMATION, "Welcome Navod ").show();
            setUi("Client2Form");

        }
        else if (txtUserName.getText().equalsIgnoreCase("pituwara") && txtPassword.getText().
                equalsIgnoreCase("1236")) {
            new Alert(Alert.AlertType.CONFIRMATION, "Welcome Pituwara ").show();
            setUi("Client3Form");

        } else {
            new Alert(Alert.AlertType.WARNING, "Please check your Username and Password").show();

        }
    }
    private void setUi(String location) throws IOException {
        location = "LoginForm";
        root.getChildren().clear();
        root.getChildren().add(FXMLLoader.load(ClientAppInitializer.class.getResource("client/view/" + location + ".fxml")));
    }
}
