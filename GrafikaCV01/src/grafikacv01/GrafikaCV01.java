package grafikacv01;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GrafikaCV01 extends Application{

    /**
     * @param args the command line arguments
     */

       @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GrafikaCV01.fxml"));
        stage.setTitle("Grafika CV_01");
        stage.setScene(new Scene(root));
        stage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }
}
