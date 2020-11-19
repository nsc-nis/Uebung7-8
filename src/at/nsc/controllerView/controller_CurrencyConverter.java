package at.nsc.controllerView;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import at.nsc.model.model_CurrencyConverter;

import java.text.NumberFormat;
import java.text.ParseException;

/**Übung 8 - Controller
 * @author Niklas Schachl
 * @version 1.0 , 19.11.2020
 */
public class controller_CurrencyConverter
{

    @FXML
    private TextField textField_EuroField;
    @FXML
    private TextField textField_YenField;

    private model_CurrencyConverter currencyConverter;

    private static final  NumberFormat DEC2FORMAT;

    static
    {
        DEC2FORMAT = NumberFormat.getNumberInstance();
        DEC2FORMAT.setGroupingUsed(true);
        DEC2FORMAT.setMinimumFractionDigits(2);
        DEC2FORMAT.setMaximumFractionDigits(2);
    }

    @FXML
    public void action_ConvertButton()
    {
        convert();
    }

    public controller_CurrencyConverter() {
        currencyConverter = new model_CurrencyConverter();
    }

    private void convert()
    {
        try
        {
            double euro = DEC2FORMAT.parse(textField_EuroField.getText()).doubleValue();
            double yen = currencyConverter.euroToYen(euro);
            textField_YenField.setText(DEC2FORMAT.format(yen));
        }
        catch (ParseException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
