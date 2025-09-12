package es.erlantzg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loaded = new FXMLLoader(getClass().getResource("/fxml/flowpane12Sep.fxml"));
        Scene scene = new Scene(loaded.load(), 320, 240);

        scene.getStylesheets().add(getClass().getResource("/css/estilos.css").toExternalForm());

        stage.setTitle("FlowPane Alignment");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}