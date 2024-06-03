package demo.modul6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloController extends Application {

    @Override
    public void start(Stage primaryStage) {
        HelloApplication loginForm = new HelloApplication();
        Scene loginScene = new Scene(loginForm, 300, 200);

        primaryStage.setTitle("Login");
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}