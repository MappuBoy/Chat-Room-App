package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.beans.AppletInitializer;
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
            Parent load=FXMLLoader.load(getClass().getResource("../view/Client1Form.fxml"));
            Scene scene= new Scene(load);
            Stage stage=new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();


        }
        else if (txtUserName.getText().equalsIgnoreCase("navod") && txtPassword.getText().
                equalsIgnoreCase("1235")) {
            new Alert(Alert.AlertType.CONFIRMATION, "Welcome Navod ").show();
            Parent load=FXMLLoader.load(getClass().getResource("../view/Client2Form.fxml"));
            Scene scene= new Scene(load);
            Stage stage=new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();


        }
        else if (txtUserName.getText().equalsIgnoreCase("pituwara") && txtPassword.getText().
                equalsIgnoreCase("1236")) {
            new Alert(Alert.AlertType.CONFIRMATION, "Welcome Pituwara ").show();
            Parent load=FXMLLoader.load(getClass().getResource("../view/Client3Form.fxml"));
            Scene scene= new Scene(load);
            Stage stage=new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();


        } else {
            new Alert(Alert.AlertType.WARNING, "Please check your Username and Password").show();
            clearloginOnAction();
        }
    }
    public void clearloginOnAction() {
        txtUserName.clear();
        txtPassword.clear();

    }

}
