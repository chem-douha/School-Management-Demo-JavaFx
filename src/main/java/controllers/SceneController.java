package controllers;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class SceneController {

    public void changeScene(Stage stage, String viewName, String title){

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/"+viewName));
            stage.setScene(new Scene(root));
            stage.setTitle(title);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            stage.setX((screenBounds.getWidth() - stage.getWidth())/2);
            stage.setY((screenBounds.getHeight() - stage.getHeight())/2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openNewScene(String viewName, String title){

        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/view/"+viewName));
            stage.setScene(new Scene(root));
            stage.setTitle(title);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            stage.setX((screenBounds.getWidth() - stage.getWidth())/2);
            stage.setY((screenBounds.getHeight() - stage.getHeight())/2);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
