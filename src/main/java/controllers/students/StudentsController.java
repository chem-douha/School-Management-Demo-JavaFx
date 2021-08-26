package controllers.students;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


public class StudentsController {



    @FXML
    private JFXTextField searchField;

    @FXML
    private TableView<?> studentTable;

    @FXML
    private TableColumn<?, Integer> idColumn;

    @FXML
    private TableColumn<?, String> nameColumn;

    @FXML
    private TableColumn<?, String> levelColumn;

    @FXML
    private TableColumn<?, String> groupColumn;

    @FXML
    private TableColumn<?, Integer> classColumn;

    @FXML
    private TableColumn<?, String> cardTypeColumn;

    @FXML
    private TableColumn<?, String> cardNumberColumn;

    @FXML
    private TableColumn<?, String> phoneColumn;

    @FXML
    private TableColumn<String , Date> regDateColumn;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    void handleDelete(ActionEvent event) {

    }

    @FXML
    void handleEdit(ActionEvent event) {

    }



    @FXML
    void handleInsert(ActionEvent event) {
    }


    @FXML
    void closeAction(MouseEvent event) {

    }

    @FXML
    void serachAction(MouseEvent event) {
    }

    @FXML
    void searchActionByTyped(KeyEvent event) {

    }


    @FXML
    void initialize() {

    }
}
