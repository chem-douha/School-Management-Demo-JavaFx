package controllers.levels;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;


public class LevelController  {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> levelTable;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> levelColumn;

    @FXML
    private TableColumn<?, ?> scienceColumn;




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
    void insertLevel(ActionEvent event)  {


    }



    @FXML
    void insertScience(ActionEvent event) {

    }



    @FXML
    void initialize() {


}

}
