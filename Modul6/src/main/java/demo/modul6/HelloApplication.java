package demo.modul6;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends GridPane {

    public HelloApplication() {
        setAlignment(Pos.CENTER);

        Label titleLabel = new Label("Halaman Login");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);


        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Label messageLabel = new Label();

        add(usernameLabel, 0, 0);
        add(usernameField, 1, 0);
        add(passwordLabel, 0, 1);
        add(passwordField, 1, 1);
        add(loginButton, 1, 2);
        add(messageLabel, 1, 3);

        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (username.equals("Moon") && password.equals("Zacky12345678")) {
                messageLabel.setTextFill(Color.GREEN);
                messageLabel.setText("Login Sukses");

                Stage stage = (Stage) getScene().getWindow();
                stage.setScene(createHomeScene());
            } else {
                messageLabel.setTextFill(Color.RED);
                messageLabel.setText("Username / Password salah");
            }
        });

        getChildren().addAll(titleLabel, gridPane);

    }

    private Scene createHomeScene() {
        StackPane homePane = new StackPane();
        homePane.getChildren().add(new Label("Selamat datang di halaman baru!"));
        return new Scene(homePane, 300, 200);
    }
}