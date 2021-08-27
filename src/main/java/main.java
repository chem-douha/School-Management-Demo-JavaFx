import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.DBConnection;


public class main extends Application {
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/login.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("تسجيل الدخول");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
        DBConnection.getConnection();

    }

    public static void main(String[] args) {
        launch();
    }
}
