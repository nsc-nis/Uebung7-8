package at.nsc.main;

import javafx.application.Application;
import javafx.stage.Stage;
import at.nsc.controllerView.controller_CurrencyConverter;

/**Übung 8 - Main
 * @author Niklas Schachl
 * @version 1.0 , 19.11.2020
 */
public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        controller_CurrencyConverter.show(primaryStage);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
