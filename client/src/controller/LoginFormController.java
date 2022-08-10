package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
            Stage window = (Stage) this.root.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/Client1Form.fxml"))));
            window.centerOnScreen();


        }
        else if (txtUserName.getText().equalsIgnoreCase("navod") && txtPassword.getText().
                equalsIgnoreCase("1235")) {
            new Alert(Alert.AlertType.CONFIRMATION, "Welcome Navod ").show();
            Stage window = (Stage) this.root.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/Client2Form.fxml"))));
            window.centerOnScreen();


        }
        else if (txtUserName.getText().equalsIgnoreCase("pituwara") && txtPassword.getText().
                equalsIgnoreCase("1236")) {
            new Alert(Alert.AlertType.CONFIRMATION, "Welcome Pituwara ").show();
            Stage window = (Stage) this.root.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/Client3Form.fxml"))));
            window.centerOnScreen();


        } else {
            new Alert(Alert.AlertType.WARNING, "Please check your Username and Password").show();
            clearloginOnAction();
        }
    }
    public void clearloginOnAction() {
        txtUserName.clear();
        txtPassword.clear();

    }
    /*Parent load = FXMLLoader.load(getClass().getResource("../views/NipunaForm.fxml"));
    Scene scene = new Scene(load);
    Stage stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();*/

}
