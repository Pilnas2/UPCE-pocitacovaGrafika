/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafikacv02;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author marti
 */
public class GrafikaCV02 extends Application{

    /**
     * @param args the command line arguments
     */
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GrafikaCV02.fxml"));
        stage.setTitle("Grafika CV_02");
        stage.setScene(new Scene(root));
        stage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }
    
}
