package javafx_trial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class close_window extends Application  {

    Stage window;
    Scene scene;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("JavaFX Title");

        window.setOnCloseRequest( e -> {
            e.consume(); // 여기서 부터 사용자가 직접 관리한다고 JVM에 알려준다
            closeProgram2();
        });

        button = new Button("Close Program");

        button.setOnAction(e -> closeProgram2());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        scene = new Scene(layout, 500, 300);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram1(){
        System.out.println("File is saved.");
        window.close();
    }
    private void closeProgram2() {
        Boolean answer = ConfirmBox.display("Title", "정말 종료합니까?");
        if (answer) {
            System.out.println("종료합니다");
            window.close();
        } else {
            System.out.println("종료하지 않습니다.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}