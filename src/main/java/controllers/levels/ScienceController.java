package controllers.levels;

import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.text.Normalizer;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class ScienceController  {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField scienceField;

    @FXML
    private JFXComboBox<String> levelBox;

    @FXML
    private TableView<?> scienceTable;

    @FXML
    private TableColumn<?, Integer> idColumn;

    @FXML
    private TableColumn<?, String> scienceColumn;

    @FXML
    private TableColumn<?, String> levelColumn;

    @FXML
    void closeAction(MouseEvent event) {
   }

    @FXML
    void handleDelete(ActionEvent event) {

    }

    @FXML
    void handleEdit(ActionEvent event) {

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
