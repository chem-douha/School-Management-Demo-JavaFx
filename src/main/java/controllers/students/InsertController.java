package controllers.students;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;



public class InsertController  {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameField;

    @FXML
    private TextField cardNumberField;

    @FXML
    private TextField phoneField;

    @FXML
    private DatePicker regDate;

    @FXML
    private ComboBox<String> levelBox;

    @FXML
    private ComboBox<String> classBox;

    @FXML
    private ComboBox<String> cardTypeBox;


    @FXML
    void closeAction(MouseEvent event) {
    }

    @FXML
    void handleCancel(ActionEvent event) {

    }


    @FXML
    void onClickEnter(ActionEvent event) {

    }


    @FXML
    void handleSave(ActionEvent event) {

    }


    @FXML
    void initialize() {


    }



}
