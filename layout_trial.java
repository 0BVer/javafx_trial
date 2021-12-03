package javafx_trial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class layout_trial  extends Application  {

    Stage window;
    Scene scene;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("JavaFX Layout");

        HBox topMenu = new HBox();
        Button button1 = new Button("File");
        Button button2 = new Button("Edit");
        Button button3 = new Button("View");
        topMenu.getChildren().addAll(button1, button2, button3);

        VBox leftMenu = new VBox();
        Button button4 = new Button("파일");
        Button button5 = new Button("편집");
        Button button6 = new Button("보기");
        Button[] bts = new Button[10];
        for (int i = 0; i < bts.length; i++){
            leftMenu.getChildren().add(new Button("버튼" + i));
        }
        leftMenu.getChildren().addAll(button4, button5, button6);

//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(topMenu);
//        borderPane.setLeft(leftMenu);
        ScrollPane borderPane = new ScrollPane();
        borderPane.setContent(topMenu);
        borderPane.setContent(leftMenu);


        scene = new Scene(borderPane, 500, 300);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}