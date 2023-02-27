/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafikacv02_1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author marti
 */
public class GrafikaCV02_1 extends Application{

    /**
     * @param args the command line arguments
     */
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GrafikaCV02_1.fxml"));
        root.setStyle("-fx-background-color: gray");
        stage.setTitle("Calculator");
        stage.setScene(new Scene(root));
        stage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }
    
}
