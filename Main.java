package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        //primaryStage.setTitle("Requester Form");
        //primaryStage.setScene(new Scene(root, 800, 500));
        //primaryStage.show();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

        public static Main instance;
        Request request = new Request("Yasin", "yas2ktk@gmail.com",123415, "finance",
                "football","play football", "sport", "-", 22 ,"-", "1200", "200", "12th of March");





}
