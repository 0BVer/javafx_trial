package javafx_trial;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

class AlertBox {
    public static void display(String title, String msg){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(300);

        Label label = new Label();
        label.setText(msg);
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 300, 500);
        window.setScene(scene);
        window.showAndWait();
    }
}

class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String msg){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(300);

        Label label = new Label();
        label.setText(msg);

        // create 2 buttons

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 300, 500);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}

public class new_box extends Application {
    Stage window;
    Scene scene;
    Button button, button2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Title Here");

        button = new Button("Alert");
        button.setOnAction(e -> AlertBox.display("Window", "alert box is awesome"));

        button2 = new Button("Confirm");
        button2.setOnAction(e -> ConfirmBox.display("Window", "comfirm box is awesome"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
//        layout.getChildren().add(button2);
        scene = new Scene(layout, 500, 300);
        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
