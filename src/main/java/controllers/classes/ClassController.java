package controllers.classes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;



public class ClassController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField classField;


    @FXML
    void closeAction(MouseEvent event) {

    }

    @FXML
    private TableView<?> classTable;

    @FXML
    private TableColumn<?, Integer> idColumn;


    @FXML
    private TableColumn<?, Integer> classColumn;


    @FXML
    void onClickEnter(ActionEvent event) {

    }

    @FXML
    void handleSave() {


    }
    @FXML
    void handleEdit(ActionEvent event) {


    }
    @FXML
    void handleDelete(ActionEvent event) {

    }




    @FXML
    void initialize() {

    }

}
