package controllers.students;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;


public class EditController {


    private int selectedStudentId;
    ObservableList<String> cardType = FXCollections.observableArrayList();


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameField;

    @FXML
    private ComboBox<String> cardTypeBox;


    @FXML
    private TextField cardNumberField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField absenceField;

    @FXML
    private TextField payment1Field;

    @FXML
    private TextField payment2Field;

    @FXML
    private TextField payment3Field;

    @FXML
    private ComboBox<String> levelBox;

    @FXML
    private ComboBox<String> groupBox;

    @FXML
    private ComboBox<String> classBox;

    @FXML
    private DatePicker regDate;

    @FXML
    void closeAction(MouseEvent event) {

    }

    @FXML
    void comboAction(ActionEvent event) {

    }

    @FXML
    void handleCancel(ActionEvent event) {

    }

    @FXML
    void onClickEnter(ActionEvent event) {
        ;
    }

    @FXML
    void handleSave(ActionEvent event) {

        }



    @FXML
    void initialize() {




    }
}