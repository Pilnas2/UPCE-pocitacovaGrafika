/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package grafikacv02_1;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author marti
 */
public class GrafikaCV02_1Controller implements Initializable {

    @FXML
    private ComboBox<String> ComboBoxOperace;
    @FXML
    private TextField tfPrvniHodnota;
    @FXML
    private TextField tfDruhaHodnota;
    @FXML
    private Button btnCalculate;
    @FXML
    private Button btnClose;
    private TextField tfVysledek;
    @FXML
    private Label lbVysl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ComboBoxOperace.setItems(FXCollections.observableArrayList("/", "*", "-", "+"));
    }

    @FXML
    private void onActionComboBox(ActionEvent event) {

    }

    @FXML
    private void onActionCalculate(ActionEvent event) {
        try {
            double prvniHodnota = Double.parseDouble(tfPrvniHodnota.getText());
            double druhaHodnota = Double.parseDouble(tfDruhaHodnota.getText());
            double vysledek = 0;
            String operace = ComboBoxOperace.getValue();
            switch (operace) {
                case "+":
                    vysledek = prvniHodnota + druhaHodnota;
                    break;
                case "-":
                    vysledek = prvniHodnota - druhaHodnota;
                    break;
                case "*":
                    vysledek = prvniHodnota * druhaHodnota;
                    break;
                case "/":
                    vysledek = prvniHodnota / druhaHodnota;
                    break;
                default:
                    vysledek = prvniHodnota / druhaHodnota;
                    break;

            }
            lbVysl.setText(Double.toString(vysledek));
        } catch (Exception e) {
            (new Alert(Alert.AlertType.ERROR, "Zadejte správné hodnoty, včetně správně zadané operace", ButtonType.CLOSE)).show();
        }

    }

    @FXML
    private void onActionClose(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure? Do you want to close the application?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            Platform.exit();
            System.exit(0);
        }
    }

}
