package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.ResourceBundle;

import static sample.Screen2Controller.requestArrayList;

public class Main extends Application {



    public static void main(String[] args) {
        launch(args);

        ArrayList<Request> requestList = new ArrayList<Request>();
        requestList.add(new Request("Yasin", "yas2ktk@gmail.com", 123415, "finance",
                "football", "play football", "sport", "-", 22, "-", "1200", "200", "12th of March"));
        requestList.add(new Request("Hassan", "has@gmail.com", 123415, "cars",
                "soccer", "play football", "sport", "playing soccer with bros", 100, "-", "1200", "200", "4th of March"));
        for (Request r : requestList) {
            r.getRequesterFullName();
            System.out.print(r.getRequesterFullName());
        }
    }

        public void onSubmit(ActionEvent event) {
        // STEP 1: get the new entry from the form

        Request newentry = new Request("Yasin", "yas2ktk@gmail.com", 123415, "finance",
                "football", "play football", "sport", "-", 22, "-", "1200", "200", "12th of March");

        // STEP 2: add the new entry into your arrayList of requests
        requestArrayList().add(newentry);

        // STEP 3: clear the form
        clearForm();



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



        /** public static Main instance;
        Request request = new Request("Yasin", "yas2ktk@gmail.com",123415, "finance",
                "football","play football", "sport", "-", 22 ,"-", "1200", "200", "12th of March"); **/




}
