package controllers.login;


import java.net.URL;
import java.util.ResourceBundle;

import controllers.SceneController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void closeAction(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void loginAction(ActionEvent event) {
        new SceneController().changeScene((Stage)((Node)(event.getSource())).getScene().getWindow(),"home.fxml","صفحة البداية");
    }

    @FXML
    void initialize() {

    }
}
