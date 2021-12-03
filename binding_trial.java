package javafx_trial;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class binding_trial extends Application {

    Stage window;
    Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("JavaFX Layout");

        TextField userInput = new TextField();
        userInput.setMaxWidth(200);

        Label firstLabel = new Label("Hello and Welcome! ");
        Label secondLabel = new Label();

        Button bt1 = new Button("submit");

        HBox bottomText = new HBox(firstLabel, secondLabel);
        bottomText.setAlignment(Pos.CENTER);

        VBox layout = new VBox(10, userInput, bottomText, bt1);
        layout.setAlignment(Pos.CENTER);

        secondLabel.textProperty().bind(userInput.textProperty());

        scene = new Scene(layout, 500, 300);
        // CSS 파일 적용
//        scene.getStylesheets().add(getClass().getResource("theme.css").toString());
        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}