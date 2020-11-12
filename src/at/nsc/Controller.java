package at.nsc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Übung 7
 * @author Niklas Schachl
 * @version 1.0 , 12.11.2020
 */
public class Controller
{
    @FXML Button button_Convert;
    @FXML TextField textField_EuroField;
    @FXML TextField textField_YenField;

    public void doConvertion()
    {
        double euroValue = Double.parseDouble(textField_EuroField.getText());

        CurrencyConverter currencyConverter = new CurrencyConverter();
        double yenValue = currencyConverter.euroToYen(euroValue);

        textField_YenField.setText(String.format("%f", yenValue));
    }
}
