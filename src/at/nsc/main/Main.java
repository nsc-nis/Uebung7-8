package at.nsc.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**Übung 8 - Main
 * @author Niklas Schachl
 * @version 1.0 , 19.11.2020
 */
public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/at/nsc/controllerView/view_CurrencyConverter.fxml"));
        primaryStage.setTitle("Übung 8");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}