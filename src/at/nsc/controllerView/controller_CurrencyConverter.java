package at.nsc.controllerView;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import at.nsc.model.model_CurrencyConverter;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ResourceBundle;

/**Übung 8 - Controller
 * @author Niklas Schachl
 * @version 1.0 , 19.11.2020
 */
public class controller_CurrencyConverter implements Initializable
{

    public static void show(Stage stage_primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(controller_CurrencyConverter.class.getResource("/at/nsc/controllerView/view_CurrencyConverter.fxml"));
        stage_primaryStage.setTitle("Übung 8");
        stage_primaryStage.getIcons().add(new Image("/at/nsc/logo.png"));
        stage_primaryStage.setScene(new Scene(root));
        stage_primaryStage.show();
    }
    @FXML
    private TextField textField_EuroField;
    @FXML
    private TextField textField_YenField;

    @FXML
    private ChoiceBox choiceBox_YenBox;

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

    private void convert()
    {
        try
        {
            double euro = DEC2FORMAT.parse(textField_EuroField.getText()).doubleValue();
            String currency = (String)choiceBox_YenBox.getValue();

            double yen = currencyConverter.doConversion(euro, currency);
            textField_YenField.setText(DEC2FORMAT.format(yen));
        }
        catch (ParseException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        currencyConverter = new model_CurrencyConverter();

        for (int i = 0; i < 100; i++) //Mehr als 100 Währungen werden niemals vorhanden sein, also braucht man diese Schleife auch beim hinzufügen neuer Währungen nicht ändern
        {
            try
            {
                choiceBox_YenBox.getItems().add(currencyConverter.getCurrencies(i));
            }
            catch (Exception ex)
            {
                break;
            }
        }
    }
}
