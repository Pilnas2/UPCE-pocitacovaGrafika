/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package grafikacv01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author marti
 */
public class GrafikaCV01Controller implements Initializable {

    @FXML
    private Button btnPlus;
    @FXML
    private Button btnMinus;
    @FXML
    private Label lbText;
    @FXML
    private RadioButton RdBtnPoJedne;
    @FXML
    private RadioButton RdBtnSlider;
    @FXML
    private RadioButton RdBtnTextField;
    @FXML
    private Slider SliderCislo;
    @FXML
    private TextField TFKrok;

    int hodnotaSlider;
    @FXML
    private ToggleGroup hodnoty;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void onActionMinus(ActionEvent event) {
        hodnotaSlider = (int) SliderCislo.getValue();
        if (RdBtnSlider.isSelected()) {
            String cislo = lbText.getText();
            //prevod cislo(String) na cele cislo(int)
            int num = Integer.parseInt(cislo);
            //prevod cislo(int) na retezec(String)
            String odecitani = Integer.toString(num - hodnotaSlider);
            lbText.setText(odecitani);
        } else if (RdBtnTextField.isSelected()) {
            String textFieldKrok = TFKrok.getText();
            int textCisla = Integer.parseInt(textFieldKrok);
            String cislo = lbText.getText();
            //prevod cislo(String) na cele cislo(int)
            int num = Integer.parseInt(cislo);
            //prevod cislo(int) na retezec(String)
            String odecitani = Integer.toString(num - textCisla);
            lbText.setText(odecitani);
        } else if (RdBtnPoJedne.isSelected()) {
            String cislo = lbText.getText();
        //prevod cislo(String) na cele cislo(int)
        int num = Integer.parseInt(cislo);
        //prevod cislo(int) na retezec(String)
        String odecitani = Integer.toString(num - 1);
        lbText.setText(odecitani);
        }
    }

    @FXML
    private void onActionPlus(ActionEvent event) {
        hodnotaSlider = (int) SliderCislo.getValue();
        if (RdBtnSlider.isSelected()) {
            String cislo = lbText.getText();
            //prevod cislo(String) na cele cislo(int)
            int num = Integer.parseInt(cislo);
            //prevod cislo(int) na retezec(String)
            String scitani = Integer.toString(num + hodnotaSlider);
            lbText.setText(scitani);
        } else if (RdBtnTextField.isSelected()) {
            String textFieldKrok = TFKrok.getText();
            int textCisla = Integer.parseInt(textFieldKrok);
            String cislo = lbText.getText();
            //prevod cislo(String) na cele cislo(int)
            int num = Integer.parseInt(cislo);
            //prevod cislo(int) na retezec(String)
            String scitani = Integer.toString(num + textCisla);
            lbText.setText(scitani);
        } else if (RdBtnPoJedne.isSelected()) {
            String cislo = lbText.getText();
            int num = Integer.parseInt(cislo);
            String scitani = Integer.toString(num + 1);
            lbText.setText(scitani);
        }

    }

    @FXML
    private void onActionPoJedne(ActionEvent event) {
    }

    @FXML
    private void onActionSlider(ActionEvent event) {
    }

    @FXML
    private void onActionTextField(ActionEvent event) {
    }

    @FXML
    private void onActionSliderCislo(MouseEvent event) {
    }

    @FXML
    private void onActonTFKrok(ActionEvent event) {
    }
}
