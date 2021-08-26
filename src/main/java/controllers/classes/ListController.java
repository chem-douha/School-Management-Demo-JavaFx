package controllers.classes;

import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTreeView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;


public class ListController  {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTabPane ListTabPane;

    @FXML
    private TableView<?> absenceTable;

    @FXML
    private TableColumn<?, String> idColumn;

    @FXML
    private TableColumn<?, String> nameColumn;

    @FXML
    private TableColumn<?, Integer> classColumn;

    @FXML
    private TableColumn<?, Integer> absenceColumn;

       @FXML
     private JFXTreeView<String> treeView;


    @FXML
    void closeAction(MouseEvent event) {

    }

    @FXML
    void insertClass(ActionEvent event) {

    }



        @FXML
     void initialize() {




    }
}
