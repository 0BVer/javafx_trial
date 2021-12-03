package javafx_trial;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class UI extends Application implements EventHandler<ActionEvent> {

    Button button1;
    Button button2;
    Button button3;
    Label label1;

    @Override
    public void start(Stage primaryStage) throws Exception{

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10));
        hbox.setSpacing(10);

        label1 = new Label("Label 1");
        label1.setFont(new Font("Arial", 30));


        primaryStage.setTitle("Button");
        button1 = new Button("Button 1");
        button1.setOnAction(this);
        button1.setPrefSize(100, 30);

        button2 = new Button("Button 2");
        button2.setOnAction(this);
        button2.setPrefSize(100, 30);

        button3 = new Button("Button 3");
        button3.setOnAction(this);
        button3.setPrefSize(100, 30);


        hbox.getChildren().add(label1);
        hbox.getChildren().add(button1);
        hbox.getChildren().add(button2);
        hbox.getChildren().add(button3);


        primaryStage.setScene(new Scene(hbox, 550, 950));
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        button1.setOnAction(e -> System.out.println("CLICKED Button 1"));

        button2.setOnAction(e -> System.out.println("CLICKED Button 2"));

        button3.setOnAction(e ->
        {
            System.out.println("CLICKED Button 3");
            System.out.println("Amazing JavaFx");
        });
    }




    public static void main(String[] args) {
        launch(args);
    }
}