package javafx_trial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Scene_trial extends Application {
    Stage window;
    Scene scene1, scene2;
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        // label1, button1

        Label label1 = new Label("JAVA FX Label");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(e->window.setScene(scene2));

        // layout1

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 300, 300);

        // button 2

        Button button2 = new Button("Go back to Scene 1");
        button2.setOnAction(e->window.setScene(scene1));

        // layout 2

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 500,300);

        window.setScene(scene1);
        window.setTitle("Title Here");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
