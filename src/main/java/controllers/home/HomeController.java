package controllers.home;

import java.net.URL;
import java.util.ResourceBundle;

import controllers.SceneController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HomeController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label schoolLabel;


    @FXML
    void onClickAbout(ActionEvent event) {
        new SceneController().openNewScene("about.fxml","عن المطور");

    }

    @FXML
    void onClickClasses(ActionEvent event) {

    }

    @FXML
    void onClickReportCard(ActionEvent event) {

    }

    @FXML
    void onClickLevels(ActionEvent event) {

    }

    @FXML
    void onClickSettings(ActionEvent event) {

    }

    @FXML
    void onClickStudent(ActionEvent event) {

    }




    @FXML
    void closeAction(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }
}
